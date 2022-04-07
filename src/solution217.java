import java.util.HashSet;
import java.util.Set;

public class solution217 {

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> store = new HashSet<>();
        for (int value : nums) {
            if (!store.add(value)) {
                return true;
            }
        }
        return false;
        // if (nums.length <= 1) {
        // return false;
        // }
        // Arrays.sort(nums);
        // for (int i = 1; i < nums.length; i++) {
        // if (nums[i] == nums[i - 1]) {
        // return true;
        // }
        // }
        // return false;

    }
}