public class solutionInterview {

    public static int stringReduction(String s) {
        // Write your code here
        int[] a = new int[3];
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == 'a') a[0]++;
                    if (s.charAt(i) == 'b') a[1]++;
                    if (s.charAt(i) == 'c') a[2]++;
                }

                while (true) {
                    int c = a[0] + a[1] + a[2];
                    if (a[0] == c || a[1] == c || a[2] ==c)
                        break;

                    if (a[0] <= a[1] && a[0] <= a[2]) {
                        a[0]++;
                        a[1]--;
                        a[2]--;
                    } else if (a[1] <= a[0] && a[1] <= a[2]) {
                            a[1]++;
                            a[0]--;
                            a[2]--;
                    } else if (a[2] <= a[0] && a[2] <= a[1]) {
                                a[2]++;
                                a[0]--;
                                a[1]--;
                    };


                }
                return a[0] + a[1] + a[2];
        }

    public static void main(String[] args) {
        solutionInterview a = new solutionInterview();
        System.out.println(a.stringReduction("abcabc"));

	}
}