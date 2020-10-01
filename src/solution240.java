import java.util.HashSet;
import java.util.Set;

public class solution240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        // if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
        // return false;
        // }
        // int left = 0;
        // int right = matrix.length - 1;
        // while (left < right) {
        // int mid = left + (right - left) / 2;
        // if (matrix[mid][0] > target) {
        // right = mid - 1;
        // } else if (matrix[mid][0] < target) {
        // left = mid;
        // } else {
        // return true;
        // }
        // }
        // if (right == -1) {
        // right++;
        // }
        // int start = 0;
        // int end = matrix[0].length - 1;
        // while (start <= end) {
        // int mid = start + (end - start) / 2;
        // if (matrix[right][mid] == target) {
        // return true;
        // } else if (matrix[right][mid] < target) {
        // start = mid + 1;
        // } else {
        // end = mid - 1;
        // }
        // }
        // return false;
        if (matrix == null || matrix.length == 0)
            return false;
        int x = matrix.length - 1;
        int y = 0;
        while (x >= 0 && y < matrix[0].length) {
            if (matrix[x][y] > target) {
                x--;
            } else if (matrix[x][y] < target) {
                y++;
            } else {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        solution240 a = new solution240();
        int[][] arr = new int[][] { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 },
                { 10, 13, 14, 17, 24 }, { 18, 21, 23, 26, 30 } };
        System.out.println(a.searchMatrix(arr, 5));
    }
}