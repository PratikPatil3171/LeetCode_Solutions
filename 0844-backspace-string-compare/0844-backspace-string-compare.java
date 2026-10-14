class Solution {
    public boolean backspaceCompare(String s, String t) {
        // return build(s).equals(build(t));


        int i = s.length()-1;
        int j = t.length()-1;
        int skipS =0;
        int skipT =0 ;
        while(i>=0 || j>=0){
                while(i>=0){
                    if(s.charAt(i)=='#'){
                        skipS++;
                        i--;
                    }else if(skipS>0){
                        skipS--;
                        i--;
                    }else{
                        break;
                    }
                }
                while(j>=0){
                    if(t.charAt(j)=='#'){
                        skipT++;
                        j--;
                    }else if(skipT>0){
                        skipT--;
                        j--;
                    }else{
                        break;
                    }
                }
                if(i>=0 && j>=0){
                    if(s.charAt(i)!=t.charAt(j)) return false;
                }else{
                    if(i>=0 || j>=0) return false;
                }
                i--;
                j--;
        }
        return true;
    }
    // private String build(String str){
    //     Stack<Character> st = new Stack<>();
    //     for(char ch:str.toCharArray()){
    //         if(ch=='#'){
    //             if(!st.isEmpty()){
    //                 st.pop();
    //             }else{
    //                 st.push(ch);
    //             }
    //         }
    //     }
    //     StringBuilder result = new StringBuilder();
    //     for(char c:st){
    //         result.append(c);
    //     }
    //     return result.toString();
    // }
}