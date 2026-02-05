public class printZ {
    public static void main(String[] args) {

        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= 4; j++) {
                if (i == 0 || i == 4) {
                    System.out.print(" * ");
                } else if (j == 4 - i) {

                    System.out.printf(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
