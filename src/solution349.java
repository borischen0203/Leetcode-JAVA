import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class solution349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> result = new HashSet<Integer>();
        Set<Integer> set1 = new HashSet<Integer>();
        for (int i : nums1) {
            set1.add(i);
        }
        Set<Integer> set2 = new HashSet<Integer>();
        for (int i : nums2) {
            set2.add(i);
        }
        result.retainAll(set2);
        int[] ans = new int[result.size()];
        int index = 0;
        for (int i : result) {
            ans[index++] = i;
        }
        return ans;
    }
}