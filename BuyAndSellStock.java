public class BuyAndSellStock {

    public static int maxProfit(int[] nums) {

        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : nums) {

            if (price < minPrice) {
                minPrice = price;   // buy here
            } else {
                maxProfit = Math.max(maxProfit, price - minPrice); // sell here
            }
        }

        return maxProfit;
    }
}
