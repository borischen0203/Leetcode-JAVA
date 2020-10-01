/**
 * Given two strings s and t , write a function to determine if t is an anagram
 * of s.
 * 
 * Example 1:
 * 
 * Input: s = "anagram", t = "nagaram" Output: true
 * 
 * Example 2:
 * 
 * Input: s = "rat", t = "car" Output: false
 * 
 * Note: You may assume the string contains only lowercase alphabets.
 * 
 * Follow up: What if the inputs contain unicode characters? How would you adapt
 * your solution to such case?
 * 
 */
public class solution242 {
    public boolean isAnagram(String s, String t) {
        String first = s.replace(" ", "").toLowerCase();
        String second = t.replace(" ", "").toLowerCase();
        if (first.length() != second.length()) {
            return false;
        }
        int[] alph = new int[26];
        for (int i = 0; i < first.length(); i++) {
            alph[first.charAt(i) - 'a']++;
            alph[second.charAt(i) - 'a']--;
        }
        for (int i : alph) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        solution242 a = new solution242();
        String s = "Dormitory";
        String t = "Dirty room";
        System.out.println(a.isAnagram(s, t));
    }
}