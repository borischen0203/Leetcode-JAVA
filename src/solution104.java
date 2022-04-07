public class solution104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        // root.left.left = new TreeNode(4);
        // root.left.right = new TreeNode(5);
        // root.left.right.left = new TreeNode(1);
        // root.right.right = new TreeNode(7);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        solution104 s = new solution104();
        System.out.println(s.maxDepth(root));
    }
}