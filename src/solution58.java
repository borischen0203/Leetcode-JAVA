/**
 * 
 * Given a string s consists of upper/lower-case alphabets and empty space
 * characters ' ', return the length of last word (last word means the last
 * appearing word if we loop from left to right) in the string.
 * 
 * If the last word does not exist, return 0.
 * 
 * Note: A word is defined as a maximal substring consisting of non-space
 * characters only.
 * 
 * Example:
 * 
 * Input: "Hello World"
 * 
 * Output: 5
 */

public class solution58 {
    // public int lengthOfLastWord(String s) {
    // String[] ss = s.split("\\s+");
    // if (ss.length == 0) {
    // return 0;
    // } else {
    // int lastIndex = ss.length - 1;
    // return ss[lastIndex].length();
    // }
    // }

    public int lengthOfLastWord(String s) {
        int result = 0;
        String ss = s.trim();
        int index = ss.length() - 1;
        if (index < 0) {
            return 0;
        } else {
            for (int i = ss.length() - 1; i >= 0; i--) {
                if (ss.charAt(i) == ' ') {
                    break;
                } else {
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        solution58 s = new solution58();
        String ss = "                  ";
        String[] sa = ss.split("\\s+");
        // System.out.println(sa.length);
        // System.out.println(Arrays.toString(sa));
        System.out.println(s.lengthOfLastWord("  "));
    }
}