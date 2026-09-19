class Solution {
    public int maxAbsoluteSum(int[] nums) {
        // int maxAbsSum = 0;
        // int n = nums.length;
        
        // for (int i = 0; i < n; i++) {
        //     int currentSum = 0;
        //     for (int j = i; j < n; j++) {
        //         currentSum += nums[j];
        //         maxAbsSum = Math.max(maxAbsSum, Math.abs(currentSum));
        //     }
        // }
        
        // return maxAbsSum;

        int maxEndingHere = 0;
        int minEndingHere = 0;
        int maxSum = 0;
        int minSum = 0;
        
        for (int num : nums) {
            maxEndingHere = Math.max(num, maxEndingHere + num);
            maxSum = Math.max(maxSum, maxEndingHere);
            
            minEndingHere = Math.min(num, minEndingHere + num);
            minSum = Math.min(minSum, minEndingHere);
        }
        
        return Math.max(maxSum, Math.abs(minSum));
    }
}