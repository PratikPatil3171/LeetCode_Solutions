class Solution {
    public int peakValleyDifference(int[] nums) {
        int n = nums.length;
        int ans=0;
       
        for(int i=1;i<n-1;i++){
            if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                ans+=nums[i];
            }
            if(nums[i]<nums[i-1] && nums[i]<nums[i+1]){
                ans-=nums[i];
            }
        }
        return ans;
    }
}