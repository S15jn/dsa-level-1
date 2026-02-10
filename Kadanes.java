public class Kadanes {
    public static int kadnesAlogo(int[] nums) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < nums.length; i++) {
            cs = Math.max(nums[i], cs + nums[i]);
            ms = Integer.max(cs, ms);
        }
        return ms;
    }
}
