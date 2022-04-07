import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class solution94 {

    public void inorderWalk(ArrayList<Integer> output, TreeNode root) {
        if (root == null) {
            return;
        } else {
            inorderWalk(output, root.left);
            output.add(root.val);
            inorderWalk(output, root.right);
        }
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        inorderWalk(result, root);
        return result;
    }

    public List<Integer> inorder(TreeNode root) {
        ArrayList<Integer> inorderWalk = new ArrayList<Integer>();
        // Iterative function to perform in-order traversal of the tree
        // create an empty stack
        Stack<TreeNode> stack = new Stack<>();
        // start from root node (set current node to root node)
        TreeNode curr = root;
        // if current node is null and stack is also empty, we're done
        while (!stack.empty() || curr != null) {
            // if current node is not null, push it to the stack (defer it)
            // and move to its left child
            if (curr != null) {
                stack.push(curr);
                curr = curr.left;
            } else {
                // else if current node is null, we pop an element from stack,
                // print it and finally set current node to its right child
                curr = stack.pop();
                inorderWalk.add(curr.val);
                curr = curr.right;
            }
        }
        return inorderWalk;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(40);
        root.left = new TreeNode(20);
        root.left.left = new TreeNode(10);
        root.left.left.left = new TreeNode(5);
        root.left.right = new TreeNode(30);
        root.right = new TreeNode(50);
        root.right.right = new TreeNode(60);
        root.left.right.left = new TreeNode(67);
        root.left.right.right = new TreeNode(78);
        solution94 a = new solution94();
        System.out.println(a.inorderTraversal(root));
        System.out.println(a.inorder(root));

    }
}