import java.util.HashMap;
import java.util.Map;

/**
 * 
 * You are given an array of strings words and a string chars.
 * 
 * A string is good if it can be formed by characters from chars (each character
 * can only be used once).
 * 
 * Return the sum of lengths of all good strings in words.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: words = ["cat","bt","hat","tree"], chars = "atach" Output: 6
 * Explanation: The strings that can be formed are "cat" and "hat" so the answer
 * is 3 + 3 = 6.
 * 
 * Example 2:
 * 
 * Input: words = ["hello","world","leetcode"], chars = "welldonehoneyr" Output:
 * 10 Explanation: The strings that can be formed are "hello" and "world" so the
 * answer is 5 + 5 = 10.
 * 
 */

public class solution1160 {
    public int countCharacters(String[] words, String chars) {
        int result = 0;
        for (String str : words) {
            result += check(str, chars);
        }
        return result;
    }

    public int check(String word, String chars) {
        int wordLength = 0;
        if (word.length() > chars.length()) {
            return 0;
        }
        Map<Character, Integer> store = new HashMap<>();
        for (char letter : chars.toCharArray()) {
            if (!store.containsKey(letter)) {
                store.put(letter, 1);
            } else {
                store.put(letter, store.get(letter) + 1);
            }
        }
        for (char letter : word.toCharArray()) {
            if (store.containsKey(letter) && store.get(letter) > 0) {
                store.put(letter, store.get(letter) - 1);
                wordLength++;
            } else {
                return 0;
            }
        }
        return wordLength;
    }

    public static void main(String[] args) {
        solution1160 a = new solution1160();
        String[] arr = new String[] { "a", "hello" };
        System.out.println(a.countCharacters(arr, "hello"));

    }

}