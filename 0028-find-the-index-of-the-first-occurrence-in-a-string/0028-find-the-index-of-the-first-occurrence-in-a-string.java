class Solution {
    public int strStr(String haystack, String needle) {
//         int i =0;
//         int j =0;
//         int n = haystack.length();
//         int m = needle.length();
//         StringBuilder str = new StringBuilder();
//         while(i<n){
//             if(haystack.charAt(i)==needle.charAt(j)){
//                 str.append(needle.charAt(j));
//                 i++;
//                 if(j<m){
//  j++;
//                 }else{
//                     break;
//                 }
               
//             }else{
//                 i++;
//             }
//         }
//         String s = str.toString();
//         return needle.equals(s) ? 1:-1;
return haystack.indexOf(needle);
    }
}