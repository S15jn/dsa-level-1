import java.util.Stack;

class DuplicateBrackets {
    public static boolean isDuplicate(String s) {
        Stack<Character> st = new Stack<>();
for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == ')') {

                if (st.peek() == '(') {
                    return true;
                }

                while (st.peek() != '(') {
                    st.pop();
                }

                st.pop();
            } else {
                st.push(ch);
            }
        }

        return false;
       
    }

    public static void main(String[] args) {
        String s = "((a+b) +(c+d))";
        System.out.println(isDuplicate(s));
    }
}