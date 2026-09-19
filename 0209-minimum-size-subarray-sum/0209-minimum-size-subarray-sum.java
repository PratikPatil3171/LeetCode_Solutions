class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // int mini = Integer.MAX_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int sum=0;
        //     for(int j=i;j<nums.length;j++){
        //         sum+=nums[j];
        //         if(sum>=target){
        //         mini = Math.min(mini,j-i+1);
        //         break;
        //         }
        //     }
        // }
        // if(mini!=Integer.MAX_VALUE){
        // return mini;

        // }else{
        //     return 0;
        // }

        int n = nums.length;
        int left=0;
        int sum=0;
        int mini = Integer.MAX_VALUE;
        for(int right=0;right<n;right++){
            sum+=nums[right];
            while(sum>=target){
                mini = Math.min(mini,right-left+1);
                sum-=nums[left];
                left++;
            }
        }
     if(mini!=Integer.MAX_VALUE){
        return mini;

        }else{
            return 0;
        }
    }
}