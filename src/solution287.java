import java.util.HashSet;
import java.util.Set;

/**
 * 
 * Given an array nums containing n + 1 integers where each integer is between 1
 * and n (inclusive), prove that at least one duplicate number must exist.
 * Assume that there is only one duplicate number, find the duplicate one.
 * 
 * 
 */

public class solution287 {

    /**
     * @param
     * @return
     */
    public int findDuplicate(int[] nums) {
        // Arrays.sort(nums);
        // int dup = 0;
        // for (int i = 0; i < nums.length - 1; i++) {
        // if (nums[i] == nums[i + 1]) {
        // dup = nums[i];
        // }
        // }
        // return dup;

        Set<Integer> set = new HashSet<Integer>();
        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }
            set.add(num);
        }
        return -1;
    }

    public static void main(String[] args) {
        solution287 a = new solution287();
        int[] nums = new int[] { 5, 2, 4, 1, 2 };
        System.out.println(a.findDuplicate(nums));
    }

}