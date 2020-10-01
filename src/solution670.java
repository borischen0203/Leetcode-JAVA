import java.util.Arrays;

public class solution670 {
    public int maximumSwap(int num) {
        char[] c = String.valueOf(num).toCharArray();
        int start = 0;
        int end = c.length - 1;
        int maxIndex = 0;
        while (start < end) {
            for (int i = end; i > start; i--) {
                if (c[maxIndex] < c[i]) {
                    maxIndex = i;
                }
            }
            if (c[start] < c[maxIndex]) {
                char temp = c[start];
                c[start] = c[maxIndex];
                c[maxIndex] = temp;
                return Integer.valueOf(new String(c));
            }
            start++;
            maxIndex++;
        }
        return num;
    }

    public static void main(String[] args) {
        solution670 a = new solution670();
        System.out.println(a.maximumSwap(8787));
    }
}