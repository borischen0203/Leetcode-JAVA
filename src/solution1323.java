public class solution1323 {
    public int maximum69Number(int num) {
        int res = Integer.parseInt(Integer.toString(num).replaceFirst("6", "9"));
        return res;
    }

    public static void main(String[] args) {
        solution1323 s = new solution1323();
        System.out.println(s.maximum69Number(6969));
    }
}