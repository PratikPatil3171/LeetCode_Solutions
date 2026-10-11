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
    public int[] nextLargerNodes(ListNode head) {
        // ArrayList<Integer> arr =new ArrayList<>();
        // ListNode curr = head;
        // while(curr!=null){
        //     ListNode temp = curr.next;
        //     int greater =0;
        //     while(temp!=null){
        //         if(temp.val>curr.val){
        //             greater =temp.val;
        //             break;

        //         }
        //         temp = temp.next;
        //     }
        //     arr.add(greater);
        //     curr = curr.next;
        // }
        // int[] result = new int[arr.size()];
        // for(int i=0;i<arr.size();i++){
        //     result[i] = arr.get(i);
        // }
        // return result;

        ArrayList<Integer> arr = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        int  n = arr.size();
        int[] ans= new int[arr.size()];
        for(int i=n-1;i>=0;i--){

            while(!st.isEmpty()&& st.peek()<=arr.get(i)){
                st.pop();
            }
            if(!st.isEmpty()){
                ans[i] = st.peek();
            }
            st.push(arr.get(i));
        }
        return ans;
    }
}