class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        
        // 1. Find the index of the first zero
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }
        
        // Edge Case: If no zero was found, the array is already fine.
        if (j == -1) {
            return; 
        }
        
        // 2. Iterate through the rest of the array and swap
        for (int i = j + 1; i < nums.length; i++) { // FIXED: Increment i, not j
            if (nums[i] != 0) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++; // Move the zero pointer forward
            }
        }
    }
}