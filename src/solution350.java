import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int value : nums1) {
            if (map.containsKey(value)) {
                map.put(value, map.get(value) + 1);
            } else {
                map.put(value, 1);
            }
        }
        for (int value : nums2) {
            if (map.containsKey(value) && map.get(value) > 0) {
                result.add(value);
                map.put(value, map.get(value) - 1);
            }
        }
        int[] res = new int[result.size()];
        int index = 0;
        for (int value : result) {
            res[index++] = value;
        }
        return res;
    }

    public static void main(String[] args) {
        solution350 s = new solution350();
        int[] a = new int[] { 4, 4, 9, 5 };
        int[] b = new int[] { 9, 4, 9, 8, 4 };

        System.out.println(Arrays.toString(s.intersect(a, b)));
    }
}