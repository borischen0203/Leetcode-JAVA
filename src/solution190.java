/**
 * 
 * Input: 00000010100101000001111010011100
 * 
 * Output:00111001011110000010100101000000
 * 
 * 
 * 
 */

public class solution190 {
    public int reverseBits(int n) {
        StringBuffer s = new StringBuffer(String.valueOf(n));
        s.reverse();
        int result = Integer.parseInt(s.toString());
        return result;
    }

    public static void main(String[] args) {
        int i = 00000010100101000;
        solution190 a = new solution190();
        System.out.println(a.reverseBits(i));

    }
}