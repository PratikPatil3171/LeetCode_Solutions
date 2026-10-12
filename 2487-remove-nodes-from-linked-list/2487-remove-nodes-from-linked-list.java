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
    public ListNode removeNodes(ListNode head) {
        // SAME AS NEXT GREATER ELEMENT
        //  ListNode curr = head;
        //  ListNode dummy = new ListNode(0);
        //  dummy.next = head;
        //  ListNode prev = dummy;
        // while(curr!=null){
        //     ListNode temp = curr.next;
        //     boolean delete = false;
        //     while(temp!=null){
        //         if(temp.val>curr.val){
        //             delete =true;
        //             break;

        //         }
        //         temp = temp.next;
        //     }
        //     if(delete==true){
        //         prev.next = curr.next;
        //     }else{
        //         prev = curr;
        //     }
            
        //     curr = curr.next;
        // }
        // return dummy.next;

        // Stack<ListNode> stack = new Stack<>();
        // ListNode curr = head;
        // while(curr!=null){
        //     // WE ARE STORING THE NODE
        //     while(!stack.isEmpty()&&stack.peek().val<curr.val){
        //         stack.pop();
        //     }
        //     stack.push(curr);
        //     curr = curr.next;
        // }
        // ListNode dummy = new ListNode(0);
        // ListNode tail = dummy;
        // for(ListNode st:stack){
        //     tail.next = st;
        //     tail = tail.next;
        // }
        // return dummy.next;


       
        
        // 'prev' is now the new head of the reversed list
        head = reverse(head);
        ListNode curr = head;
        int maxVal = curr.val;
        
        // Step 2: Remove nodes that are smaller than the max value to their "right"
        while (curr != null && curr.next != null) {
            if (curr.next.val < maxVal) {
                // Skip/remove the node
                curr.next = curr.next.next;
            } else {
                // Update maxVal and move forward
                maxVal = curr.next.val;
                curr = curr.next;
            }
        }
        

        return reverse(head);
    }
    public ListNode reverse(ListNode head){
         ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}