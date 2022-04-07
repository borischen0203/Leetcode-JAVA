
public class solution108 {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null) {
            return null;
        } else {
            return buildAVL(nums, 0, nums.length - 1);
        }
    }

    public TreeNode buildAVL(int[] nums, int start, int end) {
        if (start > end) {
            return null;
        }
        int mid = (start + end) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = buildAVL(nums, start, mid - 1);
        root.right = buildAVL(nums, mid + 1, end);
        return root;
    }

}