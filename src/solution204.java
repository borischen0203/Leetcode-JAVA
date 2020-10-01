public class solution204 {
    public int countPrimes(int n) {
        int count = 0;
        if (n <= 1) {
            return 0;
        }
        boolean[] primeTable = new boolean[n];
        primeTable[0] = true;
        primeTable[1] = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j * i < n; j++) {
                primeTable[i * j] = true;
            }
        }
        for (boolean prime : primeTable) {
            if (prime != true) {
                count++;
            }
        }
        // for (int i = 2; i < n; i++) {
        // if (isPrime(i)) {
        // count++;
        // }
        // }
        return count;
    }

    public boolean isPrime(int number) {
        boolean isPrime = true;
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        solution204 a = new solution204();
        System.out.println(a.countPrimes(4));
        // System.out.println(a.isPrime(11));
    }
}