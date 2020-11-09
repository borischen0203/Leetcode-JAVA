import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 1. Two Sum - Easy
 * 
 * Given an array of integers nums and an integer target, return indices of the
 * two numbers such that they add up to target.
 * 
 * You may assume that each input would have exactly one solution, and you may
 * not use the same element twice.
 * 
 * You can return the answer in any order.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [2,7,11,15], target = 9 Output: [0,1] Output: Because nums[0] +
 * nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * 
 * Input: nums = [3,2,4], target = 6 Output: [1,2]
 * 
 * Example 3:
 * 
 * Input: nums = [3,3], target = 6 Output: [0,1]
 * 
 * 
 * 
 */

public class solution01 {

  public int[] twoSum(int[] nums, int target) {

    int[] result = new int[2];
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    for (int i = 0; i < nums.length; i++) {

      if (map.containsKey(target - nums[i])) {
        result[0] = map.get(target - nums[i]);
        result[1] = i;
        break;
      }
      map.put(nums[i], i);
    }
    return result;

    // two pass
    // int[] result = new int[2];
    // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    // for (int i = 0; i < nums.length; i++) {
    // if (!map.containsKey(nums[i])) {
    // map.put(nums[i], i);
    // }
    // }
    // for (int i = 0; i < nums.length; i++) {
    // if (map.containsKey(target - nums[i]) && map.get(target-nums[i]) != i) {
    // result[0] = i;
    // result[1] = map.get(target - nums[i]);
    // break;
    // }
    // }
    // return result;

    // Brute Force
    // int[] result = new int[2];
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i + 1; j < nums.length; j++) {
    // if (nums[i] + nums[j] == target) {
    // result[0] = i;
    // result[1] = j;
    // }
    // }
    // }
    // return result;
  }

  public static void main(String[] args) {
    int[] nums = new int[] { 3, 3, 3 };
    int target = 6;
    solution01 test = new solution01();
    System.out.println((Arrays.toString(test.twoSum(nums, target))));
  }
}
