public class solution7 {
    public int reverse(int x) {
        long result = 0;
        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }
        if (result <= Integer.MIN_VALUE && result >= Integer.MAX_VALUE)
            return 0;
        else
            return (int) result;
    }

    public static void main(String[] args) {
        solution7 s = new solution7();
        System.out.println(s.reverse(-4321));
    }
}