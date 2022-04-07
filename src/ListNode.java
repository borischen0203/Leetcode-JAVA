public class ListNode {
    int val;
    ListNode head;
    ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode() {
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /* UTILITY FUNCTIONS */
    /*
     * Function to insert a node at the beginging of the linked list
     */
    static ListNode push(ListNode head_ref, int new_data) {
        ListNode new_node = new ListNode(new_data);
        new_node.val = new_data;
        new_node.next = (head_ref);
        (head_ref) = new_node;
        return head_ref;
    }

    /* Function to print nodes in a given linked list */
    static void printList(ListNode node) {
        while (node != null) {
            if (node.next != null) {
                System.out.print(node.val + "->");
                node = node.next;
            } else {
                System.out.print(node.val);
                break;
            }
        }
    }

    /**
     * 
     * The method build the linked of node
     * 
     * @param list
     * @return node
     */
    static ListNode build(int[] list) {
        ListNode head = null;
        for (int i = list.length - 1; i >= 0; i--) {
            head = push(head, list[i]);
        }
        return head;
    }

    /* Driver code */
    public static void main(String args[]) {
        int[] list = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        printList(build(list));

    }
}