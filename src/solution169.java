import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/**
 * Given an array of size n, find the majority element. The majority element is
 * the element that appears more than ⌊ n/2 ⌋ times.
 * 
 * You may assume that the array is non-empty and the majority element always
 * exist in the array.
 * 
 * Example 1:
 * 
 * Input: [3,2,3] Output: 3
 * 
 * Example 2:
 * 
 * Input: [2,2,1,1,1,2,2] Output: 2
 * 
 * 
 * 
 * 
 * 
 */

public class solution169 {

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                int times = map.get(nums[i]);
                map.put(nums[i], times + 1);
            }
        }
        // int maxValueInMap = (Collections.max(map.values()));
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > nums.length / 2) {
                return entry.getKey();
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 2, 2, 1, 1, 1, 2, 2 };
        solution169 a = new solution169();
        System.out.println(a.majorityElement(arr));
    }
}