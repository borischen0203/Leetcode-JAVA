public class solution1342 {
    public int numberOfSteps(int num) {
        if (num == 0) {
            return 0;
        } else if (num % 2 == 0) {
            return numberOfSteps(num / 2) + 1;
        } else {
            return numberOfSteps((num - 1)) + 1;
        }
    }

    public static void main(String[] args) {
        solution1342 a = new solution1342();
        System.out.println(a.numberOfSteps(1));
    }
}