import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Given a binary tree, return all root-to-leaf paths.
 * 
 * Note: A leaf is a node with no children.
 * 
 * Example:
 * 
 * Input:
 * 
 * 
 * Output: ["1->2->5", "1->3"]
 * 
 * Explanation: All root-to-leaf paths are: 1->2->5, 1->3
 */

public class solution257 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<String>();
        paths(root, result, "");
        return result;
    }

    public void paths(TreeNode root, List<String> result, String current) {
        if (root == null) {
            return;
        }
        current = current + root.val;
        if (root.left == null && root.right == null) {
            result.add(current);
        }
        paths(root.left, result, current + "->");
        paths(root.right, result, current + "->");
    }

}