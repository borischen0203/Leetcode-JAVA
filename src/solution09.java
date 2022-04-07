public class solution09 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length - 1;
        while (start < end) {
            if (c[start] == c[end]) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        solution09 a = new solution09();
        // System.out.println(a.isPalindrome());
    }
}