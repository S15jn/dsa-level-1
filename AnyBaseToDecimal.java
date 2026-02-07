public class AnyBaseToDecimal {
    public static void anyBasetoDecimal(int n, int base) {
        int ans = 0;
        int p = 0;
        while (n != 0) {
            int rem = n % 10;
            ans += rem * Math.pow(base, p);
            p++;
            n /= 10;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        anyBasetoDecimal(1236, 8);
    }
}
