/**
 * 
 * Reverse a linked list from position m to n. Do it in one-pass.
 * 
 * Note: 1 ≤ m ≤ n ≤ length of list.
 * 
 * Example: Input: 1->2->3->4->5->NULL, m = 2, n = 4 Output: 1->4->3->2->5->NULL
 * 
 */
public class solution92 {

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head.next == null || head == null) {
            return head;
        }

        ListNode start = null;
        ListNode end = null;
        for (ListNode i = head; n <= 1; i = i.next, m--, n--) {
            if (m == 2) {
                start = i;
            } else if (n == 1) {
                end = i;
            }
        }

        ListNode current = start;
        ListNode prev = null;
        while (current != null && current != end.next) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        // for (ListNode i = head; n <= 1; i = i.next, m--, n--) {

        // while (m == 1) {
        // if (n != 1) {
        // ListNode current = i;
        // ListNode prev = null;
        // ListNode next = current.next;// second =2
        // current.next = prev; // first.next=null
        // end = prev;
        // prev = current; // reverse=1;
        // current = next; // first=2
        // }
        // }

        return start;
    }

    public static ListNode reverse(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode current = head;
        ListNode prev = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        int[] list = new int[] { 1, 2, 3, 4, 5, 6 };
        ListNode head = ListNode.build(list);
        // ListNode.printList(head);
        // ListNode rev = a.reverseRecursively(head);
        // ListNode.printList(rev);
        // for (ListNode x = head; x != null; x = x.next) {
        // System.out.println(x.val);
        // }
        ListNode bb = solution92.reverse(head);
        ListNode.printList(bb);

    }

}