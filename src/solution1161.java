import java.util.LinkedList;
import java.util.Queue;

public class solution1161 {
    public int maxLevelSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int currentLevel = 1;
        int result = 1;
        int maxSum = 0;
        Queue<TreeNode> store = new LinkedList<TreeNode>();
        store.offer(root);
        while (!store.isEmpty()) {
            int queueSize = store.size();
            int sum = 0;
            for (int i = queueSize; i > 0; i--) {
                TreeNode node = store.poll();
                sum += node.val;
                if (node.left != null) {
                    store.offer(node.left);
                }
                if (node.right != null) {
                    store.offer(node.right);
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
                result = currentLevel;
            }
            currentLevel++;
        }
        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-2);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(4);

        solution1161 a = new solution1161();
        System.out.println(a.maxLevelSum(root));

    }
}