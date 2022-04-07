import java.util.Arrays;

public class solution283 {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[i - count] = nums[i];
            } else {
                count++;
            }
        }
        for (int j = nums.length - count; j < nums.length; j++) {
            nums[j] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        solution283 a = new solution283();
        a.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

}