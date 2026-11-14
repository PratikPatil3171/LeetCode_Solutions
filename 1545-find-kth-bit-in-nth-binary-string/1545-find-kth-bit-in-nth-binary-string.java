class Solution {
    public char findKthBit(int n, int k) {
        String s = "0";

        for (int i = 2; i <= n; i++) {
            StringBuilder invertedReversed = new StringBuilder();
            for (int j = s.length() - 1; j >= 0; j--) {
                char c = s.charAt(j);
                invertedReversed.append(c == '0' ? '1' : '0');
            }
            
            s = s + "1" + invertedReversed.toString();
        }
       
        return s.charAt(k - 1);
    }
}