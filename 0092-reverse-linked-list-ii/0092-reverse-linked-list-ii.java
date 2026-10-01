/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }
        // int i= left-1;
        // int j= right-1;
        // while(i<j){
        //     int t = arr.get(i);
        //     arr.set(i,arr.get(j));
        //     arr.set(j,t);
        //     i++;
        //     j--;
        // }
        // temp = head;
        // int indx=0;
        // while(temp!=null){
        //    temp.val = arr.get(indx);
        //     temp = temp.next;
        //     indx++;
        // }
        // return head;

        ListNode dummynode = new ListNode(0);
        dummynode.next = head;
        ListNode prevLeft = dummynode;
        for(int i=1;i<left;i++){
            prevLeft = prevLeft.next;

        }
        ListNode curr = prevLeft.next;
        ListNode prev=null;
        for(int i=0;i<=right-left;i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode leftNode = prevLeft.next;
        prevLeft.next = prev;
        leftNode.next = curr;
        return dummynode.next;
    }
}