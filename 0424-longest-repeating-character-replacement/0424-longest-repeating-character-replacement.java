class Solution {
    public int characterReplacement(String s, int k) {
        // int n = s.length();
        // int maxLen=0;
        // for(int i=0;i<n;i++){
        //     int hash[] = new int[256];
        //     int maxFreq=0;
        //     for(int j=i;j<n;j++){
        //         hash[s.charAt(j)-'A']++;
        //         maxFreq = Math.max(maxFreq,hash[s.charAt(j)-'A']);
        //         int changes = (j-i+1)-maxFreq;
        //         if(changes<=k){
        //             maxLen = Math.max(maxLen,j-i+1);
        //         }else{
        //             break;
        //         }
        //     }
        // }
        // return maxLen;
        int[] hash = new int[26];
        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            hash[s.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq, hash[s.charAt(right) - 'A']);

            // If changes needed exceed k, shrink the window from left
            while ((right - left + 1) - maxFreq > k) {
                hash[s.charAt(left) - 'A']--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;

    }
}