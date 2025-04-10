public class BestTimetoBuyandSellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            // Update minPrice if we find a smaller price
            if (price < minPrice) {
                minPrice = price;
            }
            // Calculate potential profit and update maxProfit if it's better
            else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
