import java.util.Arrays;

public class solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m + 1] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        int[] nums1 = new int[6];
        nums1[0] = 1;
        nums1[1] = 2;
        nums1[2] = 3;

    }

}