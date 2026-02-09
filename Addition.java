public class Addition {
    public static void anyAddition(int a, int b, int base) {
        int carry = 0;
        int sum = 0;
        int p = 1;
        while (a != 0 || b != 0 || carry != 0) {
            int res = (a % 10) + (b % 10) + carry;
            int digit = res % base;
            carry = res / base;
            sum = sum + (digit * p);
            p *= 10;
            a /= 10;
            b /= 10;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        anyAddition(767, 421, 8);

    }
}
