import java.util.ArrayList;

public class Primefactorial {
    public static ArrayList<Integer> primefact(int n) {
        ArrayList<Integer> al = new ArrayList<>();
        int i = 2;
        while (n != 1) {

            if (n % i == 0) {
                n = n / i;
                if (!al.contains(i)) {
                    al.add(i);
                }
            } else {
                i++;
            }

        }

        return al;
    }

    public static void main(String[] args) {
        System.out.println(primefact(24));
    }
}
