class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        // int cnt=0;
        // int n = nums.length;
        // for(int i=0;i<n;i++){
        //     HashSet<Integer> set    = new HashSet<>();
        //     for(int j=i;j<n;j++){
        //         set.add(nums[j]);
        //         if(set.size()==k){
        //             cnt++;
        //         }else if(set.size()>k){
        //             break;
        //         }
        //     }
        // }
        // return cnt;
       return atMostK(nums, k) - atMostK(nums, k - 1);
    }
    private int atMostK(int[] nums, int k) {
        if (k == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int l = 0;
        int count = 0;

        for (int r = 0; r < nums.length; r++) {
            map.put(nums[r], map.getOrDefault(nums[r], 0) + 1);

            // Shrink window if distinct elements exceed k
            while (map.size() > k) {
                map.put(nums[l], map.get(nums[l]) - 1);
                if (map.get(nums[l]) == 0) {
                    map.remove(nums[l]);
                }
                l++;
            }

            // All subarrays ending at 'r' starting from index 'l' to 'r' have <= k distinct elements
            count += (r - l + 1);
        }

        return count;
    }
}