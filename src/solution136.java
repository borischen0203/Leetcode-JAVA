import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * Example 1:
 * 
 * Input: [2,2,1] Output: 1
 * 
 * Example 2:
 * 
 * Input: [4,1,2,1,2] Output: 4
 * 
 * 
 * 
 */

public class solution136 {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> store = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!store.containsKey(nums[i])) {
                store.put(nums[i], i);
            } else {
                store.remove(nums[i]);
            }
        }
        // Map.Entry<Integer, Integer> entry = store.entrySet().iterator().next();
        // Integer key = entry.getKey();
        // return key;
        int firstKey = store.keySet().iterator().next();
        return firstKey;
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 7, 7, 3, 3, 5, 6, 6, 5, 1, 1, 0 };
        solution136 a = new solution136();
        System.out.println(a.singleNumber(nums));

    }

}