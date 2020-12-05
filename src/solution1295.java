public class solution1295 {
    public int findNumbers(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int res = 0;
        for (int n : nums) {
            if (findDigit(n) % 2 == 0) {
                res += 1;
            }
        }
        return res;
    }

    public int findDigit(int num) {
        return (int) Math.log10(num) + 1;
    }

    public static void main(String[] args) {
        solution1295 s = new solution1295();
        int[] nums = { 1, 2, 3, 4, 50 };
        System.out.println(s.findNumbers(nums));
    }
}