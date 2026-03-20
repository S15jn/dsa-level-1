public class ConvertBinaryToggle {
    public static int isConvert(int n) {
        String s = Integer.toBinaryString(n);
        StringBuilder sb = new StringBuilder();
        for (int index = 0; index < s.length(); index++) {
            if (s.charAt(index) == '0') {
                sb.append('1');
            } else if (s.charAt(index) == '1') {
                sb.append('0');
            }

        }
        String st = sb.toString();
        return Integer.parseInt(st, 2);

    }

    public static void main(String[] args) {
        System.out.println(isConvert(10));
    }
}
