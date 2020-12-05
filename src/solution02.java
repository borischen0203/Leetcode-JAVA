/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4] Output: [7,0,8] Explanation: 342 + 465 =
 * 807.
 * 
 * Example 2:
 * 
 * Input: l1 = [0], l2 = [0] Output: [0]
 * 
 * Example 3:
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1]
 * 
 * 
 * 
 */

public class solution02 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int count = 0;
        ListNode head = new ListNode();
        while (l1 != null || l2 != null) {
            int num1 = l1 != null ? l1.val : 0;
            int num2 = l2 != null ? l2.val : 0;
            int num = num1 + num2;
            num += count;
            if (num > 9) {
                count = num / 10;
            }
            append(head, num % 10);
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
            if (l1 == null && l2 == null) {
                append(head, count);
            }
        }
        return head.next;
    }

    public void append(ListNode head, int new_data) {
        ListNode new_node = new ListNode(new_data);
        new_node.next = null;

        ListNode last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }

    public static void main(String[] args) {
        int[] list = new int[] { 0 };
        int[] list2 = new int[] { 0 };
        ListNode l1 = ListNode.build(list);
        ListNode l2 = ListNode.build(list2);
        // ListNode.printList(l1);
        // ListNode.printList(l2);
        solution02 s = new solution02();
        ListNode.printList(s.addTwoNumbers(l1, l2));

    }
}