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
    public ListNode mergeKLists(ListNode[] lists) {
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(ListNode head:lists){
        //     while(head!=null){
        //         arr.add(head.val);
        //         head = head.next;
        //     }
        // }
        // Collections.sort(arr);
        // ListNode dummy = new ListNode(0);
        // ListNode curr = dummy;
        // for(int num:arr){
        //     curr.next = new ListNode(num);
        //     curr = curr.next;
        // }
        // return dummy.next;
    //     if(lists==null || lists.length==0){
    //         return null;
    //     }
    //     ListNode result = lists[0];
    //     for(int i=1;i<lists.length;i++){
    //         result = merge(result,lists[i]);
    //     }
    //     return result;
    // }
    // public ListNode merge(ListNode list1,ListNode list2){
    //     ListNode dummy = new ListNode(0);
    //     ListNode curr = dummy;
    //     while(list1!=null&&list2!=null){
    //             if(list1.val<=list2.val){
    //                 curr.next = list1;
    //                 list1 = list1.next;
    //             }else{
    //                 curr.next = list2;
    //                 list2 = list2.next;
    //             }
    //             curr = curr.next;
    //     }
    //     if(list1!=null) curr.next = list1;
    //     if(list2!=null) curr.next = list2;
    //     return dummy.next;

// MIN HEAP
    PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
    for(ListNode list:lists){
        if(list!=null)
            pq.offer(list);
    }

    ListNode dummy = new ListNode(0);
    ListNode curr = dummy;
    while(!pq.isEmpty()){
        ListNode nod = pq.poll();
        curr.next = nod;
        curr = curr.next;

        if(nod.next!=null)
            pq.offer(nod.next);
    }


        return dummy.next;

    }
}