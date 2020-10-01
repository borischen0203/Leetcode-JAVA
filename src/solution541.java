public class solution541 {
    public String reverseStr(String s, int k) {
        StringBuffer result = new StringBuffer();
        String front = s.substring(0, k).trim();
        String back = s.substring(k, s.length()).trim();
        char[] c = front.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            result.append(Character.toString(c[i]));
        }
        result.append(back);
        return result.toString();
    }

    public static void main(String[] args) {
        solution541 a = new solution541();
        System.out.println(a.reverseStr("abcdefg", 2));
    }
}