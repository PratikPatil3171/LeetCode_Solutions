class Solution {
    public int minMergedInteger(int[] nums) {
            int mini = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i+=2){
            String mergedValue = String.valueOf(nums[i]) +String.valueOf(nums[i+1]);
            int mergedv = Integer.parseInt(mergedValue);
            mini = Math.min(mini,mergedv);
        }
        return mini;
    }
}