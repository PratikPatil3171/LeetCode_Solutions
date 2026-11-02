class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        // int closestSum = nums[0]+nums[1]+nums[2];
        // int minDiff = Math.abs(closestSum-target);
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             int sum = nums[i]+nums[j]+nums[k];
        //             int diff = Math.abs(sum-target);

        //             if(diff<minDiff){
        //                 minDiff = diff;
        //                 closestSum = sum;
        //             }
        //         }
        //     }
        // }
        // return closestSum;

    Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        int minDiff = Math.abs(closestSum-target);
        int n=nums.length;
        for(int i=0;i<n-2;i++){
           int left = i+1;
           int right= n-1;
           while(left<right){
            int sum = nums[i]+nums[left]+nums[right];
            if(sum==target){
                return target;
            }
            int diff = Math.abs(sum-target);
            if(diff<minDiff){
            minDiff = diff;
                closestSum = sum   ;
            }
            if(sum<target){
                left++;
            }else{
                right--;
            }
           }
        }
        return closestSum;

    }
}