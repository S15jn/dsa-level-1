import java.util.Stack;

public class NextGreatestnumber {
    public static int[] nextGreta(int[] nums) {
        if (nums.length < 1)
            return new int[] { -1 };
        int[] res = new int[nums.length];
        Stack<Integer> st = new Stack<>();
        st.push(nums[0]);
        int j = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > st.peek()) {
                res[j] = nums[i];
                j++;
                st.push(nums[i]);
            }

        }
    }
}
