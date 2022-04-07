public class solution114 {
    public void flatten(TreeNode root) {
        if (root != null) {
            return;
        }
        flatten(root.left);
        moveRight(root);
        flatten(root.right);
    }

    public void moveRight(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode temp = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode current = root;
        while (current.right != null) {
            current = current.right;
        }
        current.right = temp;
    }

    // public void flatten(TreeNode root) {
    // if (root == null) {
    // return;
    // }
    // Stack<TreeNode> stack = new Stack<>();
    // stack.add(root);
    // while (!stack.isEmpty()) {
    // TreeNode current = stack.pop();
    // if (current.right != null) {
    // stack.add(current.right);
    // }
    // if (current.left != null) {
    // stack.add(current.left);
    // }
    // if (!stack.isEmpty()) {
    // current.right = stack.peek();
    // current.left = null;
    // }
    // }
    // }

    public static void main(String[] args) {
        solution114 a = new solution114();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(6);
        // root.right.left = new TreeNode();
        a.flatten(root);
        System.out.println(root);

    }
}