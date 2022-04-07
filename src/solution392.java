public class solution392 {
    public boolean isSubsequence(String s, String t) {
        int point1 = 0;
        int point2 = 0;
        while (point1 < s.length() && point2 < t.length()) {
            if (s.charAt(point1) == t.charAt(point2)) {
                point1++;
                point2++;
            } else {
                point2++;
            }
        }
        return point1 == s.length();

    }

    public static void main(String[] args) {
        solution392 a = new solution392();
        System.out.println(a.isSubsequence("", ""));
    }
}