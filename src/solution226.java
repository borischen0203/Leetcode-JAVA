import java.util.LinkedList;
import java.util.Queue;

import javax.xml.namespace.QName;

public class solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }

        Queue<TreeNode> store = new LinkedList<>();
        store.add(root);
        while (!store.isEmpty()) {
            TreeNode cur = store.poll();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;
            if (cur.left != null) {
                store.add(cur.left);
            }
            if (cur.right != null) {
                store.add(cur.right);
            }
        }

        return root;
        // else {
        // TreeNode left = invertTree(root.left);
        // TreeNode right = invertTree(root.right);
        // root.left = right;
        // root.right = left;
        // return root;
        // }
    }
}