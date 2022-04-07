import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class solution79 {
    public boolean exist(char[][] board, String word) {
        if (board.length == 0) {
            return false;
        }
        char[] c = word.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char cell = board[i][j];
                if (map.containsKey(cell)) {
                    map.put(cell, map.get(cell) + 1);
                    ;
                } else {
                    map.put(cell, 1);
                }
            }
        }
        for (char cell : c) {
            if (map.containsKey(cell) && map.get(cell) > 0) {
                map.put(cell, map.get(cell) - 1);
            } else {
                return false;
            }

        }
        return true;
    }

    public int solution(int[] A) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i : A) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            } else {
                map.put(i, 1);
            }
        }
        for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        // char[][] c = new char[][] { { 'A', 'B', 'C', 'E' }, { 'S', 'F', 'C', 'S' }, {
        // 'A', 'D', 'E', 'E' } };
        char[][] c = new char[][] { { 'a', 'b', }, { 'c', 'd' } };
        solution79 a = new solution79();
        // System.out.println(a.exist(c, "abcd"));
        int[] arr = new int[] { 9, 3, 9, 3, 9, 7, 9 };
        System.out.println(a.solution(arr));

    }
}