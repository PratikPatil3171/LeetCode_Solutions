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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        ListNode tail = head;
        int len=1;
        while(tail.next!=null){
            len++;
            tail = tail.next;
        }
        if( k % len==0) return head;
        k = k % len;
        int req = len-k;
        tail.next = head;
        ListNode newNode = head;
        while(newNode!=null){
            req--;
            if(req==0) break;
            newNode = newNode.next;
        }
        head = newNode.next;
        newNode.next = null;
        return head;
    }
}