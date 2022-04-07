import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Given an array nums of n integers, are there elements a, b, c in nums such
 * that a + b + c = 0? Find all unique triplets in the array which gives the sum
 * of zero.
 * 
 * Example:
 * 
 * Given array nums = [-1, 0, 1, 2, -1, -4],
 * 
 * A solution set is: [ [-1, 0, 1], [-1, -1, 2] ]
 * 
 * 
 */

public class solution15 {

    /**
     * @param Array with int type
     * @return List with int
     */

    public List<List<Integer>> threeSum(int[] nums) {
        HashSet<List<Integer>> answer = new HashSet<List<Integer>>();
        if (nums != null && nums.length >= 3) {
            int pointOne;
            int pointTwo;
            int sum;

            Arrays.sort(nums);
            Arrays.toString(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                pointOne = i + 1;
                pointTwo = nums.length - 1;

                while (pointOne < pointTwo) {
                    sum = nums[pointOne] + nums[pointTwo];
                    if (sum == -nums[i]) {
                        answer.add(new ArrayList<Integer>(Arrays.asList(nums[i], nums[pointOne], nums[pointTwo])));
                        pointOne++;
                        pointTwo--;
                    } else if (sum < -nums[i]) {// sum is too small
                        pointOne++;
                    } else if (sum > -nums[i]) {// sum is too large
                        pointTwo--;
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(answer);

    }

    public static void main(String[] args) {
        solution15 a = new solution15();
        int[] nums = new int[] { 3, 0, -2, -1, 1, 4 };
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(a.threeSum(nums));
    }
}