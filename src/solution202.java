
public class solution202 {
    public boolean isHappy(int n) {
        int length = (int) (Math.log10(n) + 1);
        while (length > 1) {
            int sum = 0;
            for (int i = 1; i <= length; i++) {
                int digit = n % 10;
                sum += digit * digit;
                n = n / 10;
            }
            n = sum;
            length = (int) (Math.log10(n) + 1);
        }
        if (n == 1 || n == 7) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        solution202 a = new solution202();
        System.out.println(a.isHappy(1111111));
    }
}