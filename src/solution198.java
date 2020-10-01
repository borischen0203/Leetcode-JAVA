import java.util.Arrays;

/**
 * 
 * You are a professional robber planning to rob houses along a street. Each
 * house has a certain amount of money stashed, the only constraint stopping you
 * from robbing each of them is that adjacent houses have security system
 * connected and it will automatically contact the police if two adjacent houses
 * were broken into on the same night.
 * 
 * Given a list of non-negative integers representing the amount of money of
 * each house, determine the maximum amount of money you can rob tonight without
 * alerting the police.
 * 
 */

public class solution198 {
    int evenIndex = 2;
    int oddIndex = 1;

    public int rob(int[] nums) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {// odd
                even += nums[i];
            } else {
                odd += nums[i];
            }
        }
        System.out.println("odd: " + odd + ";even: " + even);

        return Math.max(odd, even);

    }

    public static void main(String[] args) {
        // int[] arr = new int[] { 2, 1, 1, 2 };
        // solution198 a = new solution198();
        // System.out.println(a.rob(arr));
    }
}