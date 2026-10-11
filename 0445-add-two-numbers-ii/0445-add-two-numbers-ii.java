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
    // public ListNode reverse(ListNode head){
    //     ListNode curr = head;
    //     ListNode prev= null;
    //     while(curr!=null){
    //         ListNode nxt = curr.next;
    //         curr.next = prev;
    //         prev= curr;
    //         curr = nxt;
    //     }
    //     return prev;
    // }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //IN REVERSAL CHANGED THE ORIGINAL LL

        // ListNode h1 = reverse(l1);
        // ListNode h2 = reverse(l2);
        // ListNode dummy = new ListNode(-1);
        // ListNode curr = dummy;
        // int carry=0;
        // while(h1!=null || h2!=null || carry!=0){
        //     int sum = carry;
        //     if(h1!=null){
        //         sum+=h1.val;
        //         h1 = h1.next;
        //     }
        //     if(h2!=null){
        //         sum+=h2.val;
        //         h2 = h2.next;
        //     }
        //     carry = sum/10;
        //     curr.next = new ListNode(sum%10);
        //     curr = curr.next;

        // }
        // return reverse(dummy.next);

        //ANOTHER SOLUTION WITH STACK (ASK INTERVIEWER)

        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        ListNode h1 =l1;
        ListNode h2 =l2;
        while(h1!=null){
            st1.push(h1.val);
            h1 = h1.next;
        }
        while(h2!=null){
            st2.push(h2.val);
            h2 = h2.next;
        }
        // ListNode dummy = new ListNode(-1);
        ListNode curr = null;
        int carry=0;
        while(!st1.isEmpty() || !st2.isEmpty()|| carry!=0){
            int sum = carry;
            if(!st1.isEmpty()){
                sum+= st1.pop();
               
            }
            if(!st2.isEmpty()){
                 sum+= st2.pop();
               
            }
            ListNode node = new ListNode(sum%10);
            node.next = curr;
            curr = node;
            carry = sum/10;
            // curr.next = new ListNode(sum%10);
            // curr = curr.next;

        }
        return curr;
    }
}