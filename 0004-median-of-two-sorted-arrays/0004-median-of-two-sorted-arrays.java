class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int i = 0;
        int j =0 ;
        int total = n+m;
        int arr[] = new int[total];
        int index=0;
        while(i<m && j<n){
             if(nums1[i]<=nums2[j]){
                     arr[index++] = nums1[i];
                     i++;
            }else{
                arr[index++] = nums2[j];
                     j++; 
            }
        }
        while(i<m){
            arr[index++] = nums1[i];
            i++;
        }
        while(j<n){
            arr[index++] = nums2[j];
            j++;
        }
        if(total%2==1){
            return (double)arr[total/2];
        }else{
        int mid1 = total/2-1;
        int mid2 = total/2;
        double ans =(double) (arr[mid1] + arr[mid2]) /2.0;
        return ans;
        }
      
    }
}