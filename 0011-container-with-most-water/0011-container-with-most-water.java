class Solution {
    public int maxArea(int[] height) {
        // int maxi =  0;
        // for(int i=0;i<height.length;i++){
        //     for(int j=i+1;j<height.length;j++){
        //         int heights = Math.min(height[i],height[j]);
        //         int width = j-i;
        //         maxi = Math.max(maxi,width*heights);
        //     }
        // }
        // return maxi;

        int l=0;
        int r = height.length-1;
        int maxi=0;
        while(l<r){
            int width = r-l;
            if(height[l]<height[r]){
                maxi = Math.max(maxi,width*height[l]);
                l++;
            }else{
                maxi = Math.max(maxi,width*height[r]);
                r--;
            }
        }
        return maxi;
    }
}