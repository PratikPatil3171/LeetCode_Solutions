class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        // Arrays.sort(nums);
        // List<List<Integer>> list = new ArrayList<>();
        // for(int i=0;i<n-2;i++){
        //     if(i>0 && nums[i]==nums[i-1]) continue;
        //     int j = i+1;
        //     int k = n-1;
        //     while(j<=k){
        //         int sum = nums[i]+nums[j]+nums[k];
        //         if(sum==0){
                    
                    
        //             list.add(Arrays.asList(nums[j],nums[j],nums[k]));
                   
        //             while(j<k && nums[j]==nums[j+1]) continue;
        //             while(j<k && nums[k]==nums[k-1]) continue;
        //              j++;
        //             k--;
        //         }else if(sum<0){
        //             j++;
        //         }else if(sum>0){
        //             k--;
        //         }
        //     }
        // }
        // return list;
        Set<List<Integer>> result = new HashSet<>();
        for(int i=0;i<n;i++){
            HashSet<Integer> set = new HashSet<>();
            for(int j=i+1;j<n;j++){

                    int remove = -(nums[i]+nums[j]);
                    if(set.contains(remove)){
                        List<Integer> temp = Arrays.asList(nums[i],nums[j],remove);
                        Collections.sort(temp);
                        result.add(temp);
                    }
                    set.add(nums[j]);
            }
        }
        return new ArrayList<>(result);
    }
}