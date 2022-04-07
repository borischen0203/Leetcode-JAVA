public class solution70 {
    public int climbStairs(int n) {
        // if (n <= 1) {
        // return 1;
        // } else {
        // return climbStairs(n - 1) + climbStairs(n - 2);
        // }
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];

    }

    public static void main(String[] args) {
        solution70 a = new solution70();
        System.out.println(a.climbStairs(5));
    }
}