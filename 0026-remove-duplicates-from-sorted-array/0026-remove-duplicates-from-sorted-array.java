class Solution {
    public int removeDuplicates(int[] nums) {
        // int i=0;
        // for(int j=1;j<nums.length;j++){
        //     if(nums[j]!=nums[i]){
        //         i++;
        //         nums[i]=nums[j];
        //     }
        // }
        // return i+1;

        // HashSet<Integer> set = new HashSet<>();
        // int index=0;
        // for(int i:nums){
        //     if(!set.contains(i)){
        //         set.add(i);
        //         nums[index]=i;
        //         index++;
        //     }
        // }
        // return index;

        int n=nums.length;
        int i=0;
        for(int j=i+1;j<n;j++){
            if(nums[j]!=nums[i]){
                nums[++i] = nums[j];
            }
        }
        return i+1;
    }
}