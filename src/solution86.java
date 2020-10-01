public class solution86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null) {
            return null;
        }
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        ListNode leftCurrent = left;
        ListNode rightCurrent = right;
        for (ListNode current = head; current != null; current = current.next) {
            if (current.val < x) {
                leftCurrent.next = new ListNode(current.val);
                leftCurrent = leftCurrent.next;
            } else {
                rightCurrent.next = new ListNode(current.val);
                rightCurrent = rightCurrent.next;
            }
        }
        leftCurrent.next = right.next;
        return left.next;
        // while (head != null) {
        // if (head.val < x) {
        // // leftCurrent.next = head;
        // leftCurrent.next = new ListNode(head.val);
        // leftCurrent = leftCurrent.next;
        // } else {
        // // rightCurrent.next = head;
        // rightCurrent.next = new ListNode(head.val);
        // rightCurrent = rightCurrent.next;
        // }
        // head = head.next;
        // }
        // leftCurrent.next = right.next;
        // // rightCurrent.next = null;
        // return left.next;
    }

    public static void main(String[] args) {
        solution86 a = new solution86();
        int[] list = new int[] { 1 };
        ListNode head = ListNode.build(list);
        ListNode.printList(a.partition(head, 3));
    }
}