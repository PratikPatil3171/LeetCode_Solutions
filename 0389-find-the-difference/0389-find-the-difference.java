class Solution {
    public char findTheDifference(String s, String t) {
        // int n = s.length();
        // int  m = t.length();
        // HashMap<Character,Integer> map = new HashMap<>();
        // for(int i=0;i<n;i++){
        //     map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        // }
        // for(int i=0;i<m;i++){
        //     map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        // }
        // for (Map.Entry<Character, Integer> entry : map.entrySet()) {
        //         if(entry.getValue()==1||entry.getValue()>2){
        //             return entry.getKey();
        //         }
        // }
        // return ' ';

        int n = s.length();
        int  m = t.length();
        char[] sl =  s.toCharArray();
        Arrays.sort(sl);
        char[] tl =  t.toCharArray();
        Arrays.sort(tl);
        int i = 0;
        int j = 0;
        while(j<m && i<n){
           if(sl[i]==tl[j]){
                i++;
                j++;
           }else{
                return tl[j];
           }
                
        }
        // if(i==n && j!=m){
        //     return tl[j];
        // }
        return tl[m-1];
    }
}