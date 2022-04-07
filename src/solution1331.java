import java.util.*;

public class solution1331 {
    public int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        Map<Integer, List<Integer>> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(arr[i], list);
            } else {
                map.get(arr[i]).add(i);
            }
        }
        int rank = 1;
        for (Integer key : map.keySet()) {
            List<Integer> list = map.get(key);
            for (int i = 0; i < list.size(); i++) {
                arr[list.get(i)] = rank;
            }
            rank++;
        }
        return arr;
        // int[] sorted = new int[arr.length];
        // for (int i = 0; i < arr.length; i++) {
        // sorted[i] = arr[i];
        // }
        // Arrays.sort(sorted);
        // int rank = 1;
        // Map<Integer, Integer> map = new HashMap<>();
        // for (int i = 0; i < sorted.length; i++) {
        // if (!map.containsKey(sorted[i])) {
        // map.put(sorted[i], rank++);
        // }
        // }
        // for (int i = 0; i < arr.length; i++) {
        // arr[i] = map.get(arr[i]);
        // }
        // return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 100, 100, 100 };
        solution1331 a = new solution1331();
        System.out.println(Arrays.toString(a.arrayRankTransform(arr)));
    }
}