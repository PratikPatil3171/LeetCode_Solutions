class Solution {
    public int countConsistent(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int andd = -1;
            int mini = nums[i];
            for(int j=i;j<nums.length;j++){
                mini = Math.min(mini,nums[j]);
                andd &= nums[j];
                if(andd == mini){
                    cnt ++;
                }
            }
        }
        return cnt;
    }
}