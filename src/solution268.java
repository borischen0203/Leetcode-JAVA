import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find
 * the one that is missing from the array.
 * 
 * Example 1:
 * 
 * Input: [3,0,1] Output: 2
 * 
 * Example 2:
 * 
 * Input: [9,6,4,2,3,5,7,0,1] Output: 8
 */

public class solution268 {
    public int missingNumber(int[] nums) {
        int sum = (nums.length + 1) * nums.length / 2;
        for (int number : nums) {
            sum -= number;
        }
        return sum;

        // Arrays.sort(nums);
        // for (int i = 0; i < nums.length - 1; i++) {
        // if (nums[i + 1] - nums[i] != 1) {
        // return nums[i] + 1;
        // }
        // }
        // return 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 0 };
        solution268 a = new solution268();
        System.out.println(a.missingNumber(arr));
    }

}