class Solution {
    public List<List<String>> findMismatchedSegments(String s1, String s2) {
         List<List<String>> result = new ArrayList<>();
        int n = s1.length();
        int left = 0;

        while (left < n) {
            if (s1.charAt(left) != s2.charAt(left)) {
                int right = left;
                while (right < n && s1.charAt(right) != s2.charAt(right)) {
                    right++;
                }
                result.add(Arrays.asList(s1.substring(left, right), s2.substring(left, right)));
                left = right;
            } else {
                left++;
            }
        }

        return result;
    }
}