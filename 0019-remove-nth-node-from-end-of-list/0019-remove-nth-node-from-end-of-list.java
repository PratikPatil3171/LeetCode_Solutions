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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        // int cnt = 0;
        // ListNode temp = head;

        // // Count total number of nodes
        // while (temp != null) {
        //     cnt++;
        //     temp = temp.next;
        // }

        // // If N equals total nodes → delete head
        // if (cnt == n) {
        //     return head.next;
        // }

        // // Calculate position from start
        // int res = cnt - n;
        // temp = head;

        // // Traverse to the node before target
        // while (temp != null) {
        //     res--;
        //     if (res == 0) {
        //         break;
        //     }
        //     temp = temp.next;
        // }

        // // Delete the node
        // temp.next = temp.next.next;

        // return head;
//FAST == N+1(POINT TO N+1 NODE)
        ListNode fast = head;
        for(int i=0;i<n;i++){
            fast = fast.next;
        }
        if(fast==null){
            return head.next;
        }
        ListNode slow = head;
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;

        }
        
        slow.next = slow.next.next;
        return head;
    }
}