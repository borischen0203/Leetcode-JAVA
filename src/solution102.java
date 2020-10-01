import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class solution102 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        Queue<TreeNode> store = new LinkedList<TreeNode>();
        store.add(root);
        while (!store.isEmpty()) {
            int queueSize = store.size();
            List<Integer> sub = new ArrayList<Integer>();
            for (int i = 0; i < queueSize; i++) {
                TreeNode node = store.poll();
                sub.add(node.val);
                if (node.left != null) {
                    store.offer(node.left);
                }
                if (node.right != null) {
                    store.offer(node.right);
                }
            }
            res.add(sub);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-2);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(4);
        solution102 a = new solution102();
        System.out.println(a.levelOrder(root));

    }
}