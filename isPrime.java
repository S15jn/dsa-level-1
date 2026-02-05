import java.util.ArrayList;
import java.util.Scanner;

public class isPrime {
    public static String isPrimes(int n) {
        if (n < 2)
            return "not prime";

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return "not prime";
            }
        }
        return "prime";
    }

    public static ArrayList<Integer> printNumber(int n) {
        ArrayList<Integer> al = new ArrayList<>();

        if (n < 2) {
            return al;
        }

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                al.add(i);
            }
        }
        return al;
    }
  
    public static void main(String[] args) {
        // System.out.println(isPrimes(5));
        // System.out.println(isPrimes(19));
        // System.out.println(isPrimes(21));
        // System.out.println(isPrimes(33));
        // System.out.println(isPrimes(121));
        System.out.println(printNumber(5));
    }
}
