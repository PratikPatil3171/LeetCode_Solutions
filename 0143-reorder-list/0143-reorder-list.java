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
     public ListNode reverselist(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode second = temp.next;
            temp.next = prev;
            prev = temp;
            temp = second;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        // ArrayList<ListNode> arr = new ArrayList<>();
        // if(head.next==null || head.next.next==null){
        //     return;
        // }
        // ListNode curr = head;
        // while(curr!=null){
        //     arr.add(curr);
        //     curr = curr.next;
        // }
        // int left = 0;
        // int right = arr.size()-1;
        // while(left<right){
        //     arr.get(left).next = arr.get(right);
        //     left++;
        //     if(left==right) break;
        //     arr.get(right).next = arr.get(left);
        //     right--;
        // }
        // arr.get(left).next=null;

                ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newhead = slow.next;
        slow.next=null;
        ListNode first = head;
        ListNode second  = reverselist(newhead);
        while(second!=null){
            ListNode next1 = first.next;
            ListNode next2 = second.next;
            first.next = second;
            second.next = next1;
            first = next1;
            second = next2;
        }
        
    }
}