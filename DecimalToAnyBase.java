public class DecimalToAnyBase {
    public static void decimalToAny(int n, int base) {
        int ans = 0;
        int place = 1;
        while (n != 0) {
            ans = ans + ((n % base) * place);
            place *= 10;
            n /= base;

        }
        System.out.println(ans);
    }

}
