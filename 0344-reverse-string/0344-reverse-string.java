class Solution {
    public void reverseString(char[] s) {
        // char t[] = new char[s.length];
        // int n = s.length;
        // for(int i=s.length-1;i>=0;i--){
        //     t[n-i-1]  = s[i];
        // }
        // for (int i = 0; i < n; i++) {
        //     s[i] = t[i];
        // }
        int n = s.length;
        int left=0;
        int right = n-1;
        while(left<=right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }
}