class Solution {
    public int singleNumber(int[] nums) {
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        // }
        // for(int i=0;i<nums.length;i++){
        //    if(map.get(nums[i])==1){
        //     return nums[i];
        //    }
        // }
        // return -1;

        int ones = 0;
        int twos = 0;
        for(int num:nums){
            ones = (ones^num) & ~twos;
            twos = (twos^num) & ~ones;
        }
        return ones;

    }
}