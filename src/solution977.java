import java.util.Arrays;

public class solution977 {
    public int[] sortedSquares(int[] A) {
        // for (int i = 0; i < A.length; i++) {
        // A[i] = A[i] * A[i];
        // }
        // Arrays.sort(A);
        // return A;
        int[] result = new int[A.length];
        int pointOne = 0;
        int pointTwo = A.length - 1;
        for (int i = A.length - 1; i >= 0; i--) {
            if (Math.abs(A[pointOne]) < Math.abs(A[pointTwo])) {
                result[i] = A[pointTwo] * A[pointTwo];
                pointTwo--;
            } else {
                result[i] = A[pointOne] * A[pointOne];
                pointOne++;

            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 1 };
        solution977 a = new solution977();
        System.out.println(Arrays.toString(a.sortedSquares(arr)));
    }
}