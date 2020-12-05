import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            result.add(0, curr.val);
            if (curr.left != null) {
                stack.push(curr.left);
            }
            if (curr.right != null) {
                stack.push(curr.right);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        solution145 s = new solution145();
        // TreeNode root = new TreeNode(5);
        // root.left = new TreeNode(2);
        // root.left.left = new TreeNode(1);
        // root.left.right = new TreeNode(4);
        // root.left.right.left = new TreeNode(3);
        // root.right = new TreeNode(6);
        // root.right.right = new TreeNode(8);
        // root.right.right.left = new TreeNode(7);
        // root.right.right.right = new TreeNode(9);
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(5);

        System.out.println(s.postorderTraversal(root));
    }
}