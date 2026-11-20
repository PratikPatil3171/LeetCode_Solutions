class Solution {
    public String removeStars(String s) {
        Stack<Character> st = new Stack<>();
        StringBuilder news = new StringBuilder();
        int n = s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='*'){
                st.pop();
            }else{
                st.push(s.charAt(i));
            }
        }
        for(char ch:st){
            news.append(ch);
        }
        return news.toString();
    }
}