import java.util.Arrays;

public class SumOfTwoArray {
    public static void main(String[] args) {
        int n = 5;
        int[] a = { 3, 1, 0, 7, 5 };
        int m = 6;
        int[] b = { 1, 1, 1, 1, 1, 1 };
       

        	// Write your code here.
         int k = Math.max(n, m) + 1;
    int[] ans = new int[k];

    int i = n - 1;
    int j = m - 1;
    int carry = 0;

    while (i >= 0 || j >= 0 || carry > 0) {

        int sum = carry;

        if (i >= 0) sum += a[i--];
        if (j >= 0) sum += b[j--];

        ans[k - 1] = sum % 10;
        carry = sum / 10;

        k--;
    }
//   if (ans[0] == 0)
//         return Arrays.copyOfRange(ans, 1, ans.length);
//     return ans;
//     }
}

}
