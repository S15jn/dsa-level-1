public class ProductSelf {
    public static int[] productSelf(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    sum *= nums[j];
                }
            }
            res[i] = sum;
        }
        return res;
    }
}
