class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        // long cnt=0;
        // int n = nums.length;
        // for(int i=0;i<n;i++){

        //     for(int j=i;j<n;j++){
        //         if(nums[j]<minK || nums[j]>maxK){
        //             break;
        //         }
        //         cnt++;
        //     }
        // }
        // return cnt;
        long ans = 0;
        long len = 0;
        for (int num : nums) {
            if (num >= minK && num <= maxK) {
            len++;
            ans += len;
            } else {
            len = 0;
            }
        }
        
        return ans;
    }
}