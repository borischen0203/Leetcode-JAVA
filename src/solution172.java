public class solution172 {
    public int trailingZeroes(int n) {
        int result = 0;
        while (n != 0) {
            int count = n / 5;
            result += count;
            n /= 5;
        }
        return result;
    }
}