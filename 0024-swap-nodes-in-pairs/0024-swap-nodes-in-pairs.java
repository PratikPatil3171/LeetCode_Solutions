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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null){
            return  head;
        }
        //  List<Integer> arr = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }
        // for(int i=0;i<arr.size()-1;i+=2){
        //     int t = arr.get(i);
        //    arr.set(i,arr.get(i+1));
        //    arr.set(i+1,t);
        // }
        // temp = head;
        // int i=0;
        // while(temp!=null){
        //    temp.val = arr.get(i);
        //    i++;
        //     temp = temp.next;
        // }
        // return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        while(prev.next!=null && prev.next.next!=null){
            ListNode first = prev.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next= second;
            prev = first;
        }
        return dummy.next;
    }
}