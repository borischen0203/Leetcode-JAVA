import java.util.HashMap;

public class solution13 {
    public int romanToInt(String s) {
        int result = 0;
        HashMap<Character, Integer> romanValue = new HashMap<Character, Integer>();
        romanValue.put('I', 1);
        romanValue.put('V', 5);
        romanValue.put('X', 10);
        romanValue.put('L', 50);
        romanValue.put('C', 100);
        romanValue.put('D', 500);
        romanValue.put('M', 1000);
        char[] c = s.toCharArray();
        int[] value = new int[s.length()];
        for (int i = 0; i < c.length; i++) {
            value[i] = romanValue.get(c[i]);
        }

        int index = 0;
        while (index < s.length()) {
            if (index == s.length() - 1) {
                result += value[index];
                index++;
            } else {
                if (value[index] < value[index + 1]) {
                    int num = value[index + 1] - value[index];
                    result += num;
                    index += 2;
                } else {
                    result += value[index];
                    index++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        solution13 s = new solution13();
        System.out.println(s.romanToInt("MCMXCIV"));
    }
}