import java.util.HashMap;
import java.util.Map;

public class solution387 {
    public int firstUniqChar(String s) {
        // Map<Character ,Integer> map = new HashMap<>();
        int[] arr = new int[26];
        char[] c = s.toCharArray();
        for (int i : c) {
            arr[i - 'a']++;
        }
        for (int j = 0; j < c.length; j++) {
            if (arr[c[j] - 'a'] == 1) {
                return j;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        solution387 a = new solution387();
        System.out.println(a.firstUniqChar("abaaaaaaaaaaaaaaaaa"));
    }
}