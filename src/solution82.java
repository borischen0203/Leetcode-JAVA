public class solution82 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode list = new ListNode();
        list.next = head;
        ListNode current = head;
        ListNode listCurrent = list;
        while (current != null) {
            ListNode next = current.next;
            if (next != null && current.val == next.val) {
                while (current != null && current.val == next.val) {
                    current = current.next;
                }
                listCurrent.next = current;
            } else {
                listCurrent = current;
                current = current.next;
            }
        }
        return list.next;
    }

    public static void main(String[] args) {
        ListNode list = new ListNode();
        int[] node = new int[] { 1, 2, 3, 3, 4, 5, 6, 7 };
        ListNode head = ListNode.build(node);
        solution82 a = new solution82();

        ListNode.printList(a.deleteDuplicates(head));
    }
}