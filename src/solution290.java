import java.util.HashMap;
import java.util.Map;

public class solution290 {
    public boolean wordPattern(String pattern, String str) {
        String[] arr = str.split("\\s");
        if (arr.length != pattern.length()) {
            return false;
        }
        Map<Character, String> map = new HashMap<Character, String>();
        int index = 0;
        for (char c : pattern.toCharArray()) {
            if (map.containsKey(c)) {
                if (!map.get(c).equals(arr[index++])) {
                    return false;
                }
            } else {
                if (map.containsValue(arr[index])) {
                    return false;
                }
                map.put(c, arr[index++]);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        solution290 a = new solution290();
        String str = "dog cat fish";
        String pattern = "ab";
        System.out.println(a.wordPattern(pattern, str));
    }
}