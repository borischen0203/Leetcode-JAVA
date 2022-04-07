import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preWalk = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.empty()) {
            TreeNode curr = stack.pop();
            preWalk.add(curr.val);
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
        return preWalk;
    }

    public List<Integer> preorder(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        preorderWalk(result, root);
        return result;
    }

    public void preorderWalk(ArrayList<Integer> output, TreeNode root) {
        if (root == null) {
            return;
        } else {
            output.add(root.val);
            preorderWalk(output, root.left);
            preorderWalk(output, root.right);
        }
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.right.right = new TreeNode(8);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);
        solution144 a = new solution144();

        System.out.println(a.preorderTraversal(root));
        System.out.println(a.preorder(root));
    }

}