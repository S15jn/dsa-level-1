public class GcdAndLcm {

    public static int Gcm(int n1, int n2) {
        int divs = Math.min(n1, n2);
        int div = Math.max(n1, n2);
        int rem = 1;
        while (rem != 0) {
            rem = div % divs;
            div = divs;
            divs = rem;

        }
        return div;

    }

    public static void main(String[] args) {
        System.out.println(Gcm(16, 60));
    }
}