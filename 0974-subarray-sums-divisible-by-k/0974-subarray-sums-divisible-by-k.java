class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        
        // int n = nums.length;
        // int cnt=0;
        // for(int i=0;i<n;i++){
        //     int sum=0;
        //     for(int j=i;j<n;j++){
        //             sum+=nums[j];
        //             if(sum%k==0){
        //                 cnt+=1;
        //             }
        //     }
        // }
        // return cnt;

       HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);   
        int prefixSum = 0;
        int cnt = 0;
        
        for (int num : nums) {
            prefixSum += num;
            int rem = prefixSum % k;
            if (rem < 0) {
                rem += k;
            }
            cnt += map.getOrDefault(rem, 0);

            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        
        return cnt;
    }
}