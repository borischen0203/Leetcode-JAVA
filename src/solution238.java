import java.util.Arrays;

public class solution238 {
    public int[] productExceptSelf(int[] nums) {
        // int[] arr = new int[nums.length];
        // Arrays.fill(arr, 0);
        // Integer product = 1;
        // int count = 0;
        // for (int i : nums) {
        // if (i != 0) {
        // product *= i;
        // } else {
        // count++;
        // }
        // }
        // if (count > 1) {
        // Arrays.fill(nums, 0);
        // } else {
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] == 0) {
        // arr[i] = product;
        // return arr;
        // } else {
        // nums[i] = (product / nums[i]);
        // }
        // }
        // }
        // return nums;

        int len = nums.length;
        int[] output = new int[len];

        output[0] = 1;
        // Times left elements from the leftmost.
        for (int i = 1; i < len; i++) {
            output[i] = nums[i - 1] * output[i - 1];
        }

        int p = 1;
        // Times right elements from the rightmost.
        for (int i = len - 1; i >= 0; i--) {
            output[i] = output[i] * p;
            p *= nums[i];
        }

        return output;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 4, 5, 1, 8, 2 };
        solution238 a = new solution238();
        System.out.println(Arrays.toString(a.productExceptSelf(arr)));
    }
}