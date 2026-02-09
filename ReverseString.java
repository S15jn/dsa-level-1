import java.util.Stack;

public class ReverseString {
    public static String revserse(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            res.append(str.charAt(i));
        }
        return res.reverse().toString();
    }
 
    public static void main(String[] args) {
        System.out.println(revserse("geeks"));
    }
}
