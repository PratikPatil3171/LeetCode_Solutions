class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        // int n = nums.length;
        // if(k<=1){
        //     return 0;
        // }
        // int cnt=0;
        // for(int i=0;i<n;i++){
        //     int prod=1;
        //     for(int j=i;j<n;j++){
        //         prod*=nums[j];
        //         if(prod<k){
        //               cnt++;
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return cnt;

        int n = nums.length;
        if(k<=1){
            return 0;
        }
        int left=0;
        int prod=1;
        int cnt=0;
        for(int right=0;right<n;right++){
            prod*=nums[right];
            while(prod>=k){
                prod /= nums[left];
                left++;
            }
            cnt += right-left+1;
        }
        return cnt;
    }
}