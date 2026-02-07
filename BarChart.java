public class BarChart {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 0, 7, 5 };
        int n = nums.length;

        int max = 0;

        // find max height
        for (int val : nums) {
            max = Math.max(max, val);
        }

        // print row wise
        for (int h = max; h >= 1; h--) {
            for (int i = 0; i < n; i++) {
                System.out.println("num[i]" + nums[i] + "  h " + h);

                if (nums[i] >= h) {
                    System.out.print(nums[i] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
