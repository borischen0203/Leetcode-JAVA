/**
 * Given a positive integer, return its corresponding column title as appear in
 * an Excel sheet.
 * 
 * For example:
 * 
 * 1 -> A
 * 
 * 2 -> B
 * 
 * 3 -> C ...
 * 
 * 26 -> Z
 * 
 * 27 -> AA
 * 
 * 28 -> AB ...
 * 
 * Example 1:
 * 
 * Input: 1 Output: "A"
 * 
 * Example 2:
 * 
 * Input: 28 Output: "AB"
 * 
 * Example 3:
 * 
 * Input: 701 Output: "ZY"
 */

public class solution168 {
    public String convertToTitle(int n) {
        String result = "";
        StringBuilder sb = new StringBuilder();
        while (n != 0) {
            n--;
            int num = (n % 26);
            char c = (char) ('A' + num);
            // result = c + result;

            sb.insert(0, c);
            n /= 26;
        }
        // return result;
        return sb.toString();
    }

    public static void main(String[] args) {
        solution168 s = new solution168();
        System.out.println(s.convertToTitle(53));
    }
}