import java.util.HashSet;
import java.util.Set;

public class solution1346 {
    public boolean checkIfExist(int[] arr) {
        if (arr.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<Integer>();
        for (int i : arr) {
            if (set.contains(i * 2)) {
                return true;
            } else if (i % 2 == 0 && set.contains(i / 2)) {
                return true;
            }
            set.add(i);
        }
        // int countZero = 0;
        // for (int N : arr) {
        // if (N == 0) {
        // countZero++;
        // }
        // set.add(N * 2);
        // }
        // for (int N : arr) {
        // if (set.contains(N)) {
        // if (N == 0 && countZero > 1) {
        // return true;
        // }
        // if (N != 0) {
        // return true;
        // } else {
        // continue;
        // }
        // }
        // }
        return false;
    }

    public static void main(String[] args) {
        solution1346 a = new solution1346();
        int[] arr = new int[] { 14, 2, 6, 0, 0 };
        System.out.println(a.checkIfExist(arr));
    }

}