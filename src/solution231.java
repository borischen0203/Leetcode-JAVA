public class solution231 {
    public boolean isPowerOfTwo(int n) {
        // if (n <= 0) {
        // return false;
        // }
        // while (n != 0) {
        // if (n % 2 != 0 && n != 1) {
        // return false;
        // }
        // n = n / 2;
        // }
        // return true;
        // if (n <= 0)
        // return false;
        // double a = (Math.log(n) / Math.log(2));
        // System.out.println(a);
        // int b = (int) a;
        // if (b == a) {
        // return true;
        // }
        // return false;
        return (Math.log10(n) / Math.log10(2)) % 1 == 0;
    }

    public static void main(String[] args) {
        solution231 a = new solution231();
        System.out.println(a.isPowerOfTwo(2097151));
        System.out.println(a.isPowerOfTwo(536870912));
        // System.out.println(a.isPowerOfTwo(5));
        // System.out.println(29 % 1);
    }
}