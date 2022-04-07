public class solution234 {
    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }
        ListNode left, fast, current, right = null;
        left = current = fast = head;

        while (fast != null && fast.next != null) {
            current = current.next;
            fast = fast.next.next;
        }
        while (current != null) {
            ListNode next = current.next;
            current.next = right;
            right = current;
            current = next;
        }
        while (right != null && left != null) {
            if (left.val != right.val) {
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;

    }

    public static void main(String[] args) {
        int[] list = new int[] { 1 };
        ListNode head = ListNode.build(list);
        // printList(ListNode.build(list));
        solution234 a = new solution234();
        System.out.println(a.isPalindrome(head));
    }
}