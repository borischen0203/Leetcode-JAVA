public class solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode previous = null;
        while (head.val == val) {
            head = current.next;
            current = head;
        }
        while (current != null) {
            if (head.val == val) {
                head = current.next;
                current = head;
            } else if (current.val == val) {
                previous.next = current.next;
                current = current.next;
            } else {
                previous = current;
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        int[] list = new int[] { 1, 1 };
        ListNode head = ListNode.build(list);
        // ListNode.printList(ListNode.build(list));
        // ListNode.printList(head);
        solution203 a = new solution203();
        ListNode.printList(a.removeElements(head, 1));

    }
}