/**
 * 
 * Given a binary tree, check whether it is a mirror of itself (ie, symmetric
 * around its center).
 * 
 */

public class solution101 {

    static boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left == null || right == null) {
            return false;
        } else {
            return (left.val == right.val) && isMirror(left.left, right.right) && isMirror(left.right, right.left);
        }
    }

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        } else {
            return isMirror(root, root);
        }
    }

}