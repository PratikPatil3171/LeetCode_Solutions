class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // int n = nums.length;
        // int maxi = Integer.MIN_VALUE;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<i+n;j++){
        //         int num = j%n;
        //         sum+=nums[num];
        //         maxi = Math.max(maxi,sum);
        //     }
        // }
        // return maxi;
int totalSum = 0;
        
        int currentMax = 0;
        int maxSum = Integer.MIN_VALUE;
        
        int currentMin = 0;
        int minSum = Integer.MAX_VALUE;
        
        for (int num : nums) {
            totalSum += num;
            
            // Standard Kadane's for Maximum Subarray
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);
            
            // Kadane's for Minimum Subarray
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
        }
        
        // If all elements are negative, maxSum will be negative
        if (maxSum < 0) {
            return maxSum;
        }
        
        return Math.max(maxSum, totalSum - minSum);




    }
}