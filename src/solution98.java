
public class solution98 {

    public boolean isBST(TreeNode root, Integer max, Integer min) {
        if (root == null) {
            return true;
        } else if (max != null && root.val >= max) {
            return false;
        } else if (min != null && root.val <= min) {
            return false;
        } else {
            return isBST(root.left, root.val, min) && isBST(root.right, max, root.val);
        }
    }

    public boolean isValidBST(TreeNode root) {
        return isBST(root, null, null);
    }

}