import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class solution1071 {

    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        int gcd = str1.length();
        int b = str2.length();
        while (gcd != b) {
            if (gcd > b) {
                gcd -= b;
            } else {
                b -= gcd;
            }
        }
        return str1.substring(0, gcd);
    }

    public static void main(String[] args) {
        solution1071 a = new solution1071();
        String str1 = "ABCABC";
        String str2 = "ABC";
        // System.out.println("test");
        System.out.println(a.gcdOfStrings(str1, str2));

    }
}