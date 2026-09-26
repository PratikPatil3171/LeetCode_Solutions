class Solution {
    public boolean isPalindrome(String s) {
       // BRUTE - REVERSE STRING AND THEN CHECK EQUAL OR NOT
    //    StringBuilder filtered = new StringBuilder();

    //     for (int i = 0; i < s.length(); i++) {
    //         char ch = s.charAt(i);
    //         if (Character.isLetterOrDigit(ch)) {
    //             filtered.append(Character.toLowerCase(ch));
    //         }
    //     }

    //     String original = filtered.toString();
    //     String reversed = filtered.reverse().toString();

    //     return original.equals(reversed);

    //OPTIMAL - TWO POINTER
    int left=0;
    int right = s.length()-1;
    while(left<right){
        if(!Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        else if(!Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }else{
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
    }
    return true;


        
    }
    // public boolean palindrome(int i,String s){
    //     if(i>=s.length()/2) return true;
    //     if(s.charAt(i)!=s.charAt(s.length()-i-1)) return false;

    //     return palindrome(i+1,s);

    // }
}