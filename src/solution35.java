/**
 * 
 * Given a sorted array and a target value, return the index if the target is
 * found. If not, return the index where it would be if it were inserted in
 * order.
 * 
 * You may assume no duplicates in the array.
 * 
 * Example 1:
 * 
 * Input: [1,3,5,6], 5 Output: 2
 * 
 * Example 2:
 * 
 * Input: [1,3,5,6], 2 Output: 1
 * 
 * Example 3:
 * 
 * Input: [1,3,5,6], 7 Output: 4
 * 
 * Example 4:
 * 
 * Input: [1,3,5,6], 0 Output: 0
 * 
 * 
 */

public class solution35 {

    // public int searchInsert(int[] nums, int target) {
    // int i;
    // for (i = 0; i < nums.length; i++) {
    // if (nums[i] > target) {
    // nums[i] = target;
    // return i;
    // } else if (nums[i] == target) {
    // return i;
    // }
    // }
    // return i;
    // }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 3, 5, 6 };
        int[] nums2 = new int[] { 1 };
        int[] nums3 = new int[] { 1 };
        int[] nums4 = new int[] { 3, 6, 7, 8, 10 };
        solution35 a = new solution35();
        System.out.println(a.searchInsert(nums, 4));// 2
        System.out.println(a.searchInsert(nums, 2));// 1
        System.out.println(a.searchInsert(nums, 7));// 4
        System.out.println(a.searchInsert(nums, 0));// 0
        System.out.println(a.searchInsert(nums2, 2));// 1
        System.out.println(a.searchInsert(nums3, 1));// 0
        System.out.println(a.searchInsert(nums4, 5));// 1
    }
}