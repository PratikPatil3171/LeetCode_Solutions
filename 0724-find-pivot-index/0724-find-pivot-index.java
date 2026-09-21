class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){

            int left=0;
            for(int j=0;j<i;j++){
                left+=nums[j];
            }
            int right=0;
            for(int k=i+1;k<n;k++){
                right+=nums[k];
            }
            if(left==right) return i;
        }
        return -1;
        // int total = 0;
        // for(int i:nums){
        //     total+=i;
        // }
        // int leftSum=0;
        // for(int i=0;i<nums.length;i++){
        //     if(leftSum==total-leftSum-nums[i]){
        //         return i;
        //     }
        //     leftSum+=nums[i];
        // }
        // return -1;
    }
}