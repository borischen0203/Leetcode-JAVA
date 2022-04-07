import java.util.HashMap;
import java.util.Map;

public class solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        for (char c : magazine.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
            if (map.get(c) < 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        solution383 a = new solution383();
        String ransomNote = "aa";
        String magazine = "ab";
        System.out.println(a.canConstruct(ransomNote, magazine));
    }
}