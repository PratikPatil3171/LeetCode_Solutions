class Solution {
    public int[] nextGreaterElements(int[] nums) {
        // int res[] = new int[nums.length];
        // Arrays.fill(res,-1);
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<i+nums.length;j++){
        //         int ind = j % nums.length;
        //         if(nums[ind]>nums[i]){
        //             res[i] = nums[ind];
        //             break;
        //         }
        //     }
        // }
        // return res;

        int n = nums.length;
        int[] res = new int[n];
        Arrays.fill(res, -1);
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                res[stack.pop()] = num;
            }
            if (i < n) {
                stack.push(i);
            }

            
        }
        return res;
    }
}