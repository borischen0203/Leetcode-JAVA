public class solution69 {
    public int mySqrt(int x) {
        if (x == 0)
            return 0;
        long i = x;
        while (i > x / i)
            i = (i + x / i) / 2;
        return (int) i;
    }

    public static void main(String[] args) {
        solution69 s = new solution69();
        System.out.println(s.mySqrt(36));
    }
}