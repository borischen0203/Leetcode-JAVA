public class solution239 {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        while (n != 0) {
            if (n % 2 != 0 && n != 1) {
                return false;
            }
            n = n / 2;
        }
        return true;
    }

    public static void main(String[] args) {
        solution239 a = new solution239();
        System.out.println(a.isPowerOfTwo(9));
    }
}