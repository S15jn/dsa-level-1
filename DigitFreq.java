public class DigitFreq {
    public static void main(String[] args) {
        int digit = 994543234;
        int tar = 4;
        int count = 0;
        while (digit != 0) {

            if (digit % 10 == tar) {
                count++;
            }
            digit /= 10;
        }

        System.out.println(count);
    }
}
