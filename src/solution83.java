public class solution83 {

    /**
     * 
     * Given a sorted linked list, delete all duplicates such that each element
     * appear only once.
     * 
     * Example 1: Input: 1->1->2 Output: 1->2
     * 
     * Example 2: Input: 1->1->2->3->3 Output: 1->2->3
     * 
     */

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else if (head.val == head.next.val) {
            head = deleteDuplicates(head.next);
            return head;
        } else {
            head.next = deleteDuplicates(head.next);
            return head;
        }
    }

    public ListNode deleteDuplicate(ListNode head) {
        ListNode current = head;
        while (current.next != null && current != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        solution83 a = new solution83();
        int[] list = new int[] { 1, 1, 1, 2, 3, 3 };
        ListNode head = ListNode.build(list);
        // a.deleteDuplicates(head);
        a.deleteDuplicate(head);

        ListNode.printList(head);

    }
}
