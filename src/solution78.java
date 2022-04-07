import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class solution78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new LinkedList<>();
        ArrayList<Integer> subset = new ArrayList<>();
        backtrack(res, subset, nums, 0);
        return res;
    }

    public void backtrack(List<List<Integer>> res, List<Integer> subset, int[] nums, int i) {
        if (i == nums.length) {
            res.add(new ArrayList<>(subset));
        } else {
            backtrack(res, subset, nums, i + 1);
            subset.add(nums[i]);
            backtrack(res, subset, nums, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };
        solution78 a = new solution78();
        System.out.println(a.subsets(arr));

    }
}