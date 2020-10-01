import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class solution148 {
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> store = new ArrayList<>();
        for (ListNode i = head; i != null; i = i.next) {
            store.add(i.val);
        }
        Collections.sort(store);
        int j = 0;
        for (ListNode i = head; i != null; i = i.next) {
            i.val = store.get(j);
            j++;
        }
        return head;
    }

    public static void main(String[] args) {

        int[] list = new int[] { 7, 6, 5, 4, 3, 2, 1 };

        ListNode root = ListNode.build(list);
        // ListNode.printList(ListNode.build(list));
        solution148 a = new solution148();
        ListNode.printList(a.sortList(root));
    }
}