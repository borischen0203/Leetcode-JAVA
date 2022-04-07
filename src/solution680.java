public class solution680 {
    public boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return checkPalindrome(left + 1, right, s) || checkPalindrome(left, right - 1, s);
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public boolean checkPalindrome(int left, int right, String s) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            } else {
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        solution680 a = new solution680();
        String s = "abecdba";
        System.out.println(a.validPalindrome(s));

    }
}