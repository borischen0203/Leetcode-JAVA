import java.util.ArrayList;
import java.util.List;

/**
 * 118. Pascal's Triangle - Easy
 *
 * Given a non-negative integer numRows, generate the first numRows of Pascal's
 * triangle.
 * 
 * 
 * In Pascal's triangle, each number is the sum of the two numbers directly
 * above it.
 * 
 */
public class solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        if (numRows == 0) {
            return result;
        }
        result.add(new ArrayList<>());
        result.get(0).add(1);
        for (int row = 1; row < numRows; row++) {
            List<Integer> current = new ArrayList<>();
            List<Integer> pre = result.get(row - 1);
            int rowLength = row + 1;
            for (int i = 0; i < rowLength; i++) {
                if (i == 0 || i == rowLength - 1) {
                    current.add(1);
                } else {
                    int value = pre.get(i - 1) + pre.get(i);
                    current.add(value);
                }
            }
            result.add(current);
        }
        return result;
    }

    public int fib(int number) {
        if (number == 1 | number == 0) {
            return number;
        } else {
            return fib(number - 1) + fib(number - 2);
        }
    }

    public boolean isNum(String s) {
        try {
            int i = Integer.valueOf(s);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        solution118 s = new solution118();
        // System.out.println(s.fib(6));
        // System.out.println(s.generate(3));
        System.out.println(s.isNum("0.1"));

    }
}