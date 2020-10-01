public class solution258 {
    public int addDigits(int num) {
        int length = (int) (Math.log10(num) + 1);
        while (length > 1) {
            int sum = 0;
            for (int i = 1; i <= length; i++) {
                int digit = num % 10;
                sum += digit * digit;
                num = num / 10;
            }
            num = sum;
            length = (int) (Math.log10(num) + 1);
        }
        return num;
    }

    public static void main(String[] args) {
        solution258 a = new solution258();
        System.out.println(a.addDigits(19));
    }
}