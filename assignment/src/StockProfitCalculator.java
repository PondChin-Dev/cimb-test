import java.math.BigDecimal;

public class StockProfitCalculator {

    public BigDecimal maxProfit(BigDecimal[] prices) {
        if (prices == null || prices.length == 0) {
            return BigDecimal.ZERO;
        }

        BigDecimal minPrice = BigDecimal.valueOf(Double.MAX_VALUE);
        BigDecimal maxProfit = BigDecimal.ZERO;

        for (BigDecimal price : prices) {
            if (price.compareTo(minPrice) < 0) {
                minPrice = price;
            } else if (price.subtract(minPrice).compareTo(maxProfit) > 0) {
                maxProfit = price.subtract(minPrice);
            }
        }

        return maxProfit;
    }
}
