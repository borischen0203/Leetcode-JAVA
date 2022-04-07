import java.util.Arrays;

public class solution75 {

    public void sortColor(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i : nums) {

            if (i == 0) {
                count0++;
            } else if (i == 1) {
                count1++;
            } else {
                count2++;
            }
        }
        int index = 0;
        while (index < nums.length) {
            if (count0 != 0) {
                nums[index] = 0;
                count0--;
            } else if (count1 != 0) {
                nums[index] = 1;
                count1--;
            } else {
                nums[index] = 2;
                count2--;
            }
            index++;
        }

    }

    public void sortColors(int[] nums) {
        int now = 0;
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            if (nums[left] == 0) {
                swap(nums, left++, now++);
                // left++;
                // now++;
            } else if (nums[left] == 2) {
                swap(nums, left, right--);
                // right--;
            } else {
                left++;
            }
        }

    }

    public void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;

    }

    public static void main(String[] args) {
        solution75 a = new solution75();
        int[] arr = new int[] { 2, 0, 1 };
        a.sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

}