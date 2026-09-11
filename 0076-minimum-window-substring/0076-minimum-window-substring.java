class Solution {
    public String minWindow(String s, String t) {
        // int n = s.length();
        // int m = t.length();   
        // if (m > n) return "";
        // int minLen = Integer.MAX_VALUE;
        // int startIdx = -1;
        // for (int i = 0; i < n; i++) {
        //     int[] map = new int[256];
        //     for (char c : t.toCharArray()) {
        //         map[c]++;
        //     }

        //     int count = 0;
        //     for (int j = i; j < n; j++) {
        //         char ch = s.charAt(j);
        //         if (map[ch] > 0) {
        //             count++;
        //         }
        //         map[ch]--;
        //         if (count == m) {
        //             if (j - i + 1 < minLen) {
        //                 minLen = j - i + 1;
        //                 startIdx = i;
        //             }
        //             break; 
        //         }
        //     }
        // }

        // return startIdx == -1 ? "" : s.substring(startIdx, startIdx + minLen);
     int n = s.length();
        int m = t.length();

        if (m > n) return "";

        int[] map = new int[256];
        for (char c : t.toCharArray()) {
            map[c]++;
        }

        int l = 0, r = 0;
        int count = 0;
        int minLen = Integer.MAX_VALUE;
        int startIdx = -1;

        while (r < n) {
            char rightChar = s.charAt(r);
            if (map[rightChar] > 0) {
                count++;
            }
            map[rightChar]--;

            // Shrink window from the left while it contains all characters of t
            while (count == m) {
                if (r - l + 1 < minLen) {
                    minLen = r - l + 1;
                    startIdx = l;
                }

                char leftChar = s.charAt(l);
                map[leftChar]++;
                if (map[leftChar] > 0) {
                    count--;
                }
                l++; // Must be INSIDE the while loop
            }

            r++;
        }

        return startIdx == -1 ? "" : s.substring(startIdx, startIdx + minLen);
    }
}