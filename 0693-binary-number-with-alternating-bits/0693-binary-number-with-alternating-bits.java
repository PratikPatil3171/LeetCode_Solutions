class Solution {
    public boolean hasAlternatingBits(int n) {
        // String s = Integer.toBinaryString(n);
        // int i=1;
        // while(i<s.length()-1){
        //     if(s.charAt(i)==s.charAt(i-1) || s.charAt(i)==s.charAt(i+1)){
        //         return false;
        //     }
        //     i++;
        // }
        // return true;


        // x = 101
        // x>>1 = 010 (x ^ (x>>1)) = 1111(Alternating)
        // VERIFY ALTERNATING
        // 15 -1111 16-10000 (15&16) = 0000
        int x = n ^ (n>>1);
        return (x & (x+1))==0;

    }
}