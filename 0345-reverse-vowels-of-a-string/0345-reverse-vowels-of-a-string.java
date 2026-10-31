class Solution {
    public boolean isVowels(char ch){
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
            return true;
        }
        return false;
    }
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] ch = s.toCharArray();
        while (i < j) {
           
            while (i < j && !isVowels(ch[i])) {
                i++;
            }
            
            while (i < j && !isVowels(ch[j])) {
                j--;
            }
            
           
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            
            i++;
            j--;
        }
        return new String(ch);
        
}
}