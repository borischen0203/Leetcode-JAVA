import java.util.ArrayList;
import java.util.List;

public class solution412 {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            int num = i + 1;
            boolean threeTimes = num % 3 == 0;
            boolean fiveTimes = num % 5 == 0;

            if (threeTimes && fiveTimes) {
                result.add(i, "FizzBuzz");
            } else if (fiveTimes) {
                result.add(i, "Buzz");
            } else if (threeTimes) {
                result.add(i, "Fizz");
            } else {
                result.add(i, Integer.toString(num));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        solution412 s = new solution412();
        System.out.println(s.fizzBuzz(15));
    }
}