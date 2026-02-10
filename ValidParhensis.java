import java.util.Stack;

public class ValidParhensis {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0)
            return false;
        Stack<Character> st = new Stack<>();
        for (int index = 0; index < s.length(); index++) {
            char ch = s.charAt(index);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (ch == ')' && st.peek().equals('(')) {
                    st.pop();
                }
                if (ch == '}' && st.peek().equals('{')) {
                    st.pop();
                }
                if (ch == ']' && st.peek().equals('[')) {
                    st.pop();
                }

            }

        }
        return st.isEmpty();
    }
}
