/**
 * 125. Valid Palindrome - easy
 * 
 * Given a string, determine if it is a palindrome, considering only
 * alphanumeric characters and ignoring cases.
 * 
 * Note: For the purpose of this problem, we define empty string as valid
 * palindrome.
 * 
 * Example 1:
 * 
 * Input: "A man, a plan, a canal: Panama" Output: true
 * 
 * Example 2:
 * 
 * Input: "race a car" Output: false
 * 
 * 
 * 
 * Constraints:
 * 
 * s consists only of printable ASCII characters.
 * 
 */

public class solution125 {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        String s1 = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int p = 0;
        int q = s1.length() - 1;
        boolean result = true;
        while (p < q) {
            if (s1.charAt(p) == (s1.charAt(q))) {
                p++;
                q--;
            } else {
                return false;
            }
        }
        return result;
    }
}