class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);
        // ArrayList<Integer> arr = new ArrayList<>();
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         arr.add(i);
        //     }
        // }
        // return arr;


        Arrays.sort(nums);
        
        List<Integer> result = new ArrayList<>();
        
        // Step 2: Use binary search to find the first occurrence of target
        int left = 0, right = nums.length - 1;
        int firstIndex = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                firstIndex = mid;
                right = mid - 1; // Look for earlier occurrences on the left
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // If target is not found, return empty list
        if (firstIndex == -1) {
            return result;
        }
        
        // Step 3: Find the last occurrence of target
        int lastIndex = firstIndex;
        left = firstIndex;
        right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                lastIndex = mid;
                left = mid + 1; // Look for later occurrences on the right
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        // Step 4: Add all indices from firstIndex to lastIndex
        for (int i = firstIndex; i <= lastIndex; i++) {
            result.add(i);
        }
        
        return result;
    }
}