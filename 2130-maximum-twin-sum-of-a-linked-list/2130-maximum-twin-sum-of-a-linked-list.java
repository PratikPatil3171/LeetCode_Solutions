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
    public int pairSum(ListNode head) {
        // List<Integer> arr = new ArrayList<>();
        // ListNode temp = head;
        // while(temp!=null){
        //     arr.add(temp.val);
        //     temp = temp.next;
        // }
        // int  i =0;
        // int j = arr.size()-1;
        // int ans=0;
        // while(i<j){
        //     ans=Math.max(ans,arr.get(i)+arr.get(j));
        //     i++;
        //     j--;
        // }
        // return ans;

        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev=null;
        while(slow!=null){
            ListNode nxt = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nxt;
        }
        int ans =0;
        while(prev!=null){
            ans = Math.max(ans,head.val+prev.val);
            head = head.next;
            prev = prev.next;
        }
        return ans;
    }
}