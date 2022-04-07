import java.util.LinkedList;
import java.util.Queue;

public class solution116 {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            int size = q.size();
            Node prev = null;
            for (int i = 0; i < size; i++) {
                Node current = q.poll();
                if (current != null) {
                    current.next = prev;
                    q.add(current.right);
                    q.add(current.left);
                    prev = current;
                }
            }
        }
        return root;
    }

    public static void main(String[] args) {


    }
}