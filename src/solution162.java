public class solution162 {
    public int findPeakElement(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                return i;
            }
        }
        return nums.length - 1;
    }

    public static void main(String[] args) {
        solution162 s = new solution162();
        int[] nums = new int[] { 0, 1, 2, 3, 4, 5, 6 };
        System.out.println(s.findPeakElement(nums));
    }
}