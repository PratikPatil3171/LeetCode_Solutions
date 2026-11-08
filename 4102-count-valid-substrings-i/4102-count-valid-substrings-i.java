class Solution {
    public long countValidSubstrings(String s) {
        // long cnt=0;
        
        // for(int i=0;i<n;i++){
          
        //     for(int j=i;j<n;j++){
        //        if(j-i>=2 && s.charAt(j)=='c'&&s.charAt(j-1)=='b'&&s.charAt(j-2)=='a'){
        //            break;
        //        }
        //         cnt++;
                
        //     }
        // }
    
        int n = s.length();
        long cnt=0;
        int invalid=-1;
        for(int right=0;right<n;right++){
            if(right>=2 && s.charAt(right)=='c'&&s.charAt(right-1)=='b'&&s.charAt(right-2)=='a'){
                invalid = right-2;
            }
            cnt+=(right-invalid);
        }
        return cnt;
    }
}