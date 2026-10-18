class Solution {
    public int minLength(String s) {
        // Stack<Character> stack = new Stack<>();
        // StringBuilder str =new StringBuilder();
        // for(char ch:s.toCharArray()){
        //    if (!stack.isEmpty() && ((stack.peek() == 'A' && ch == 'B') || (stack.peek() == 'C' && ch == 'D'))) {
                
                    
        //         stack.pop();
               
        //     }
        //      else{
        //                 stack.push(ch);
        //         }

        // }
        // // for(char st:stack){
        // //     str.append(st);
        // // }
        // return stack.size();

        StringBuilder str =new StringBuilder();
        for(char ch:s.toCharArray()){
            int len = str.length();
            if(len>0){
                if((str.charAt(len-1)=='A'&& ch=='B')||(str.charAt(len-1)=='C'&& ch=='D')){
                    str.deleteCharAt(len-1);
                    continue;
                }
            }
            str.append(ch);
        }
        return str.length();
    }
}