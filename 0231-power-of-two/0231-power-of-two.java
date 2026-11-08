class Solution {
    public boolean isPowerOfTwo(int n) {
    //    for(int i=0;i<31;i++){
    //     int ans = (int)Math.pow(2,i);
    //     if(ans==n){
    //         return true;
    //     }
       
    //    }
    //     return false;

    return (n>0 && (n&n-1)==0);
    
    }
}