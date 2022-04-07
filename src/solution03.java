public class solution03{
    /***
     * Given a string s, find the length of the longest substring without repeating characters.
     *
     * Example 1:
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     *
     * Example 2:
     * Input: s = "bbbbb"
     * Output: 1
     * Explanation: The answer is "b", with the length of 1.
     *
     * Example 3:
     *
     * Input: s = "pwwkew"
     * Output: 3
     * Explanation: The answer is "wke", with the length of 3.
     * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */

    public int lengthOfLongestSubstring(String s) {
        if (s=="") return 0;
        if (s.length()==1) return 1;
        char[] c = s.toCharArray();
        int n = c.length;
        int count =0;
        String ss = "";
        for (int i=0;i<n;i++){
            boolean[] visited = new boolean[256];
//            Arrays.fill(visited, Boolean.FALSE);
            for (int j=i;j<n;j++) {
                if (visited[c[j]]) {
                    break;
                } else {
                    count = Math.max(count, j - i + 1);
                    visited[c[j]]=true;
                    ss+=c[j];
                }
            }
            if (ss.length()<count){
                ss="";
            }
        }
        System.out.println(ss);
        return count;
    }

    public  int longestUniqueSubsttr(String str)
    {
        String test = "";

        // Result
        int maxLength = -1;

        // Return zero if string is empty
        if (str.isEmpty()) {
            return 0;
        }
        // Return one if string length is one
        else if (str.length() == 1) {
            return 1;
        }
        for (char c : str.toCharArray()) {
            String current = String.valueOf(c);

            // If string already contains the character
            // Then substring after repeating character
            if (test.contains(current)) {
                test = test.substring(test.indexOf(current)
                        + 1);
            }
            test = test + String.valueOf(c);
            maxLength = Math.max(test.length(), maxLength);

        }
        System.out.println(test);

        return maxLength;
    }



    public static void main(String[] args) {
        System.out.println("Hello world");
        solution03 s = new solution03();
//        System.out.println(s.lengthOfLongestSubstring("hello"));
        System.out.println(s.longestUniqueSubsttr("hello"));

    }
}