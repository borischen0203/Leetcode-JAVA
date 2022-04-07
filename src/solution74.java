/**
 * Write an efficient algorithm that searches for a value in an m x n matrix.
 * This matrix has the following properties:
 * 
 * Integers in each row are sorted from left to right. The first integer of each
 * row is greater than the last integer of the previous row.
 * 
 * Example 1:
 * 
 * Input: matrix = [ [1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50] ]
 * 
 * target = 3 Output: true
 * 
 * Example 2:
 * 
 * Input: matrix = [ [1, 3, 5, 7], [10, 11, 16, 20], [23, 30, 34, 50] ]
 * 
 * target = 13 Output: false
 */

public class solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int left = 0;
        int right = matrix.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (matrix[mid][0] > target) {
                right = mid - 1;
            } else if (matrix[mid][0] < target) {
                left = mid + 1;
            } else {
                return true;
            }
        }
        if (right == -1) {
            right++;
        }
        int start = 0;
        int end = matrix[0].length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (matrix[right][mid] == target) {
                return true;
            } else if (matrix[right][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
        // int left = 0;
        // int right = matrix.length - 1;
        // for (int i = 1; i < matrix.length; i++) {
        // if (matrix[i][0] <= target) {
        // left++;
        // } else {
        // break;
        // }
        // }
        // for (int i = 0; i < matrix[right].length; i++) {
        // if (matrix[right][i] == target) {
        // return true;
        // }
        // }
        // return false;
    }

    public static void main(String[] args) {
        // int[][] arr = new int[][] { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34,
        // 50 } };
        int[][] arr = new int[][] { { 1 } };
        solution74 a = new solution74();
        System.out.println(a.searchMatrix(arr, 5));

    }

}