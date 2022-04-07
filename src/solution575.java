import java.util.HashSet;
import java.util.Set;

public class solution575 {
    public int distributeCandies(int[] candies) {
        if (candies.length == 0) {
            return 0;
        }
        int length = candies.length / 2;
        Set<Integer> set = new HashSet<>();
        for (int i : candies) {
            if (!set.contains(i) && set.size() < length) {
                set.add(i);
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
        solution575 a = new solution575();
        int[] candies = new int[] { 1, 1, 2, 3, 3, 4 };
        System.out.println(a.distributeCandies(candies));
    }
}