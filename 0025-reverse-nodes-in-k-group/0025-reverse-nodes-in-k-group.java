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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        // ArrayList<Integer> arr = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     arr.add(temp.val);
        //     temp = temp.next;

        // }
        // for(int i=0;i+k<=arr.size();i+=k){
        //     int l = i;
        //     int r = i+k-1;
        //     while(l<r){
        //         int temp1 = arr.get(l);
        //         arr.set(l,arr.get(r));
        //         arr.set(r,temp1);
        //         l++;
        //         r--;
        //     }
        // }
        // temp = head;
        // int idx=0;
        // while(temp!=null){
        //     temp.val = arr.get(idx);
        //     idx++;
        //     temp = temp.next;
        // }
        // return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroup = dummy;
        while(true){
            ListNode kth = prevGroup;
            for(int i=0;i< k && kth!=null;i++){
                kth = kth.next;
            }
                if(kth==null) break;
                ListNode groupNext = kth.next;
                ListNode prev = groupNext;
                ListNode curr  = prevGroup.next;
                while(curr!=groupNext){
                    ListNode nxt = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr  = nxt;

                }
                ListNode temp = prevGroup.next;
                prevGroup.next = kth;
                prevGroup = temp;
            }
        
        return dummy.next;
    }
}