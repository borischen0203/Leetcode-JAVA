public class solution278 {

    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int count = 0;
        while (start < end) {
            int mid = (start + end) / 2;
            if (isBadVersion(mid)) { // if T is in left side
                end = mid;
            } else { // if T is in right side
                start = mid + 1;

            }
            count++;
        }
        System.out.println(count);
        return start;
        // int left = 1;
        // int right = n;
        // int count = 0;
        // while (left < right) {
        // int mid = left + (right - left) / 2;
        // if (isBadVersion(mid)) {
        // right = mid;
        // } else {
        // left = mid + 1;
        // }
        // count++;
        // }
        // System.out.println(count);
        // return left;
    }

    public boolean isBadVersion(int version) {
        if (version >= 8999) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        solution278 a = new solution278();
        System.out.println(a.firstBadVersion(10000));
    }
}