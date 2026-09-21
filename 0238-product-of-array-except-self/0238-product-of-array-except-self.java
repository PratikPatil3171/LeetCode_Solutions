class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int res[] = new int[nums.length];
        // int n = nums.length;
        // for(int l = 0;l<n;l++){
        //     int prod=1;
        //     for(int r = 0;r<n;r++){
        //         if(l==r) continue;
        //         prod*=nums[r];
        //     }
        //     res[l] = prod;
        // }
        // return res;
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans,0);
        ans[0]=1;
        for(int i=1;i<n;i++){
           ans[i] = ans[i-1]*nums[i-1];
        }
        int rightPro=1;
        for(int r=n-1;r>=0;r--){
            ans[r] = ans[r]*rightPro;
            rightPro*=nums[r];
        }

        return ans;
    }
}