import java.util.Arrays;

public class solution66 {
    public int[] plusOne(int[] digits) {
        int n = digits.length - 1;
        long sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i] * ((long) Math.pow(10, n));
            n--;
        }
        sum += 1;
        int[] result = new int[sum >= Math.pow(10, digits.length) ? digits.length + 1 : digits.length];
        for (int i = result.length - 1; i >= 0; i--) {
            result[i] = (int) (sum % 10);
            sum /= 10;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        solution66 s = new solution66();
        System.out.println(Arrays.toString(s.plusOne(digits)));
    }
}