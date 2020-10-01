
/**
 * 
 * Merge two sorted linked lists and return it as a new list. The new list
 * should be made by splicing together the nodes of the first two lists.
 *
 * Example: Input: 1->2->4, 1->3->4 Output: 1->1->2->3->4->4
 * 
 */

public class solution21 {

    /**
     * @param
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {// if l1 is empty, then return the last l2
            return l2;
        } else if (l2 == null) {// if l2 is empty, then return the last l1
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
    }
}