class Solution {
    public void rotate(int[] nums, int k) {
       int n=nums.length;
       k  = k % n;
       reverse_n(nums,0,n-1);
       reverse_n(nums,0,k-1);
       reverse_n(nums,k,n-1);
        
        
    }
    public static void reverse_n(int nums[],int left,int right){
        while(left<right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
    
}