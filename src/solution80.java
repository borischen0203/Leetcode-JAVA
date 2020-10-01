/**
 * 
 * Example 1:
 * 
 * Given nums = [1,1,1,2,2,3],
 * 
 * Your function should return length = 5, with the first five elements of nums
 * being 1, 1, 2, 2 and 3 respectively.
 * 
 * It doesn't matter what you leave beyond the returned length.
 * 
 * Example 2:
 * 
 * Given nums = [0,0,1,1,1,1,2,3,3],
 * 
 * Your function should return length = 7, with the first seven elements of nums
 * being modified to 0, 0, 1, 1, 2, 3 and 3 respectively.
 * 
 * It doesn't matter what values are set beyond the returned length.
 * 
 */

public class solution80 {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int last = nums[0];
        int slow = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != last) {
                nums[slow++] = nums[i];
                last = nums[i];
                count = 1;
            } else if (count < 2) {
                nums[slow++] = nums[i];
                count++;
            }
        }
        return slow + 1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 0, 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        solution80 a = new solution80();
        System.out.println(a.removeDuplicates(arr));
    }
}