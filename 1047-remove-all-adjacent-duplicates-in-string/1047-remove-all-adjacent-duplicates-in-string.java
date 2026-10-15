class Solution {
    public String removeDuplicates(String s) {
        // boolean changed =true;
        // while(changed){
        //     changed =false;
        //     StringBuilder str = new StringBuilder();
        //     for(int i=0;i<s.length();i++){
        //         if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
        //             i++;
        //             changed = true;
        //         }else{
        //             str.append(s.charAt(i));
        //         }
        //     }
        //     s = str.toString();
        // }
        // return s;

        StringBuilder str = new StringBuilder();
        
        for(char ch:s.toCharArray()){
            int len = str.length();
            if(len>0 && str.charAt(len-1)==ch){
                str.deleteCharAt(len-1);
            }else{
                str.append(ch);
            }
        }
        s = str.toString();
        return s;
    }
}