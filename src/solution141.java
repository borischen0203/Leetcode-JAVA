import java.util.HashMap;
import java.util.Map;

public class solution141 {
    public boolean hasCycle(ListNode head) {
        // Set<ListNode> store = new HashSet<>();
        // ListNode current = head;
        // while (current != null) {
        // if (store.contains(current)) {
        // return true;
        // } else {
        // store.add(current);
        // }
        // current = current.next;

        // }
        // return false;
        Map<ListNode, Integer> store = new HashMap<>();
        ListNode current = head;
        while (current != null) {
            if (store.containsKey(current)) {
                return true;
            } else {
                store.put(current, current.val);
            }
            current = current.next;
        }

        return false;

        // if (head == null || head.next == null) {
        // return false;
        // }

        // ListNode slow = head;
        // ListNode fast = head.next;

        // while (fast != null && fast.next != null) {
        // if (fast == slow) {
        // return true;
        // }

        // slow = slow.next;
        // fast = fast.next.next;
        // }

        // return false;

    }

    public static void main(String[] args) {

    }
}