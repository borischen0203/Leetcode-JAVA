import java.util.HashMap;
import java.util.Map;

public class solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        boolean result = false;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) {
                result = true;
                break;
            }
            map.put(nums[i], i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 99, 99 };
        solution219 a = new solution219();
        System.out.println(a.containsNearbyDuplicate(arr, 2));
    }
}