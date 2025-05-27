package Coding_Round;
public class PrimeNumbers {
    public static void main(String[] args) {
        printPrimes();
    }

    public static void printPrimes() {
        for (int i = 2; i <= 100; i++) {
            boolean prime = true;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) System.out.print(i + " ");
        }
        System.out.println();
    }
}