public class solution160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lengthA = 0;
        int lengthB = 0;
        for (ListNode i = headA; i != null; i = i.next) {
            lengthA++;
        }
        for (ListNode i = headB; i != null; i = i.next) {
            lengthB++;
        }
        ListNode currentA = headA;
        ListNode currentB = headB;
        while (lengthA - lengthB > 0) {
            currentA = currentA.next;
            lengthA--;
        }
        while (lengthA - lengthB < 0) {
            currentB = currentB.next;
            lengthB--;
        }
        while (currentA != null && currentB != null) {
            if (currentA != currentB) {
                currentA = currentA.next;
                currentB = currentB.next;
            } else {
                return currentA;
            }
        }
        return null;
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
        int[] listA = new int[] { 4, 1, 8, 4, 5 };
        int[] listB = new int[] { 5, 0, 1, 8, 4, 5 };
        ListNode headA = ListNode.build(listA);
        ListNode headB = ListNode.build(listB);
        solution160 a = new solution160();
        System.out.println(a.getIntersectionNode(headA, headB));

    }
}