public class Pattern {
    public static void Pattern1(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    public static void Pattern2(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");

            }
            System.out.println();
        }
    }

    public static void Pattern3(int n) {
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= n - i; k++) {
                System.out.print("   ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");

            }
            System.out.println();

        }
    }

    public static void Pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print(" * ");

            }

            System.out.println();

        }
        for (int i = n - 1; i >= 1; i--) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print(" * ");

            }

            System.out.println();
        }

    }

    public static void Pattern7(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern8(int n) {
        for (int i = n; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (j == i) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern9(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i || j == n - (i + 1)) {
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }

    public static void Pattern10(int n) {
        for (int i = 1; i < n; i++) {
            for (int k = 1; k <= n - i; k++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {

                System.out.print(" * ");

            }

            System.out.println();

        }
    }

    public static void Pattern11(int n) {
        int k = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(k + " ");
                k++;
            }
            System.out.println();
        }
    }

    public static void Pattern12(int n) {
        int a = 0;
        int b = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                System.out.print(a + " ");

                int c = a + b;
                a = b;
                b = c;

            }
            System.out.println();
        }
    }

    public static void Pattern13(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ;j++) {
                if (j == 0 || j == i) {
                    System.out.print(1 + " ");
                } else if(j<i){
                    System.out.print(i + " ");
                }

            }
            System.out.println();
        }
    }

    public static void Pattern19(int n){
    for(int i=0;i< n;i++){
        for(int j=0;j<n;j++){
            if((i == 0 && j <= n/2) ||
                (j == n/2) ||
                (i == n/2) ||
                (j == 0 && i >= n/2) ||
                (i == n-1 && j >= n/2) || (j==n-1 && i<n/2) ){
                System.out.print(" * ");
            }
            else{

                System.out.print("   ");
            }

        }
        System.out.println();
    }
    }
    public static void main(String[] args) {
        Pattern19(5);
    }
}
