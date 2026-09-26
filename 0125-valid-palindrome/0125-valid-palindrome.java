class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0) return true;
        s = s.toLowerCase();
        String filterStr = s.toLowerCase().replaceAll("[^a-z0-9]","");
       return palindrome(0,filterStr);
        
    }
    public boolean palindrome(int i,String s){
        if(i>=s.length()/2) return true;
        if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

        return palindrome(i+1,s);

    }
}