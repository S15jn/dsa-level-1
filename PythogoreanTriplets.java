public class PythogoreanTriplets {
    public static boolean pythogorean(int a, int b, int c) {
        if (a > b && a > c) {
            if (a * a == ((b * b) + (c * c))) {
                return true;
            }
        } else if (b > a && b > c) {
            if (b * b == ((a * a) + (c * c))) {

                return true;
            }
        } else if (c * c == ((a * a) + (b * b))) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(pythogorean(5, 3, 2));
    }
}
