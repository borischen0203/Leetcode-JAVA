import java.util.Arrays;

public class solution905 {
    public int[] sortArrayByParity(int[] A) {
        int pointOne = 0;
        int pointTwo = A.length - 1;
        while (pointOne < pointTwo) {
            if (A[pointOne] % 2 == 1 && A[pointTwo] % 2 == 0) {
                int temp = A[pointOne];
                A[pointOne] = A[pointTwo];
                A[pointTwo] = temp;
                pointOne++;
                pointTwo--;
            } else if (A[pointOne] % 2 == 0) {
                pointOne++;
            } else {
                pointTwo--;
            }
        }
        return A;
        // int lastEvenIndex = 0;
        // for (int i = 0; i < A.length; i++) {
        // if (A[i] % 2 == 0) {
        // int temp = A[lastEvenIndex];
        // A[lastEvenIndex] = A[i];
        // A[i] = temp;
        // lastEvenIndex++;
        // }
        // }
        // return A;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        solution905 a = new solution905();
        System.out.println(Arrays.toString(a.sortArrayByParity(arr)));
    }

}