class Solution {
    public int[] runningSum(int[] nums) {
        int arr[] = new int[nums.length];
        arr[0] = nums[0];
        // int sum = nums[0];
        for(int i=1;i<nums.length;i++){

            int j=0;
            int sum=0;
            while(j<=i){
               sum += nums[j];
               j++;  
            }
            arr[i] = sum;
        }
        return arr;

    }
}