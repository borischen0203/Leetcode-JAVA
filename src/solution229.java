import java.util.ArrayList;
import java.util.List;

public class solution229 {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<>();
        Integer candidate1 = null;
        Integer candidate2 = null;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count1 == 0) {
                count1++;
                candidate1 = nums[i];
            } else if (count2 == 0) {
                count2++;
                candidate2 = nums[i];
            } else if (candidate1 == nums[i]) {
                count1++;
            } else if (candidate2 == nums[i]) {
                count2++;
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for (int value : nums) {
            if (value == candidate1) {
                count1++;
            }
            if (value == candidate2) {
                count2++;
            }
        }
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }

    public static void main(String[] args) {
    }
}