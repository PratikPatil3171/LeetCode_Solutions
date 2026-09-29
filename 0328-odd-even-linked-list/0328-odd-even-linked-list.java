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
    public ListNode oddEvenList(ListNode head) {
        // ListNode  temp = head;
        // if(head==null || head.next==null){
        //     return head;
        // }
        // List<Integer> arr = new ArrayList<>();
        // while(temp!=null && temp.next!=null){
        //     arr.add(temp.val);
        //     temp = temp.next.next;
        // }
        // if(temp!=null) arr.add(temp.val);
        // temp = head.next;
        // while(temp!=null && temp.next!=null){
        //     arr.add(temp.val);
        //     temp = temp.next.next;
        // }
        // if(temp!=null) arr.add(temp.val);
        // int i=0;
        // temp = head;
        // while(temp!=null){
        //     temp.val = arr.get(i);
        //     i++;
        //     temp = temp.next;
        // }
        // return head;
      if (head == null || head.next == null) {
            return head;
        }
        
        ListNode odd = head;             // Tracks the odd nodes
        ListNode even = head.next;       // Tracks the even nodes
        ListNode evenHead = even;        // Saves the start of the even list to connect later
        
        // Loop through the list
        while (even != null && even.next != null) {
            odd.next = even.next;        // Link current odd node to the next odd node
            odd = odd.next;              // Move the odd pointer forward
            
            even.next = odd.next;        // Link current even node to the next even node
            even = even.next;            // Move the even pointer forward
        }
        
        // Connect the end of the odd list to the head of the even list
        odd.next = evenHead;
        
        return head;


    }
}