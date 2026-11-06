class Solution {
    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            n &= (n - 1); // Clears the rightmost set bit
            count++;
        }
        return count;


        // int helper=1;
        // int cnt=0;
        // for(int i=1;i<=32;i++){
        //     if((helper&n)!=0){
        //         cnt++;
        //     }
        //     helper = helper<<1;
        // }
        // return cnt;





        // String s = Integer.toBinaryString(n);
        // int i=0;

        // int cnt=0;
        // while(i<s.length()){
        //     if(s.charAt(i)=='1'){
        //         cnt++;
        //     }
        // }
        // return cnt;
    }
}