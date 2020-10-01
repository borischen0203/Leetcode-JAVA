import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class solution345 {
    public String reverseVowels(String s) {
        Set<Character> set = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int left = 0;
        int right = s.length() - 1;
        char[] c = s.toCharArray();
        while (left < right) {
            if (set.contains(c[left]) && set.contains(c[right])) {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            } else if (set.contains(c[left])) {
                right--;
            } else if (set.contains(c[right])) {
                left++;
            } else {
                left++;
                right--;
            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        solution345 a = new solution345();
        System.out.println(a.reverseVowels("aA"));
    }
}