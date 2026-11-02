class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n+1];
        ArrayList<Integer> a = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[nums[i]]+=1;

            if(arr[nums[i]]==2){
                a.add(nums[i]);
            }
        }
        
        return a;
    }
}