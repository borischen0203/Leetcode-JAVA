import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class solution199 {

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return new ArrayList<Integer>();
        }
        Queue<TreeNode> store = new LinkedList<TreeNode>();
        store.offer(root);
        while (!store.isEmpty()) {
            int queueSize = store.size();
            TreeNode last = null;
            for (int i = 0; i < queueSize; i++) {
                last = store.poll();
                if (last.left != null) {
                    store.offer(last.left);
                }
                if (last.right != null) {
                    store.offer(last.right);
                }
            }
            result.add(last.val);

        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        // root.left.right = new TreeNode();
        // root.right.right = new TreeNode();
        // root.right.left = new TreeNode();
        solution199 a = new solution199();
        System.out.println(a.rightSideView(root));

    }
}