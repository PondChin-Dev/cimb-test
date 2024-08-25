import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        //Q1
        StockProfitCalculator calculator = new StockProfitCalculator();
        BigDecimal[] prices = {
            new BigDecimal("10.5"),
            new BigDecimal("7.0"),
            new BigDecimal("8.5"),
            new BigDecimal("9.0"),
            new BigDecimal("15.0"),
            new BigDecimal("11.0")
        };
        
        BigDecimal maxProfit = calculator.maxProfit(prices);
        System.out.println("Max Profit: " + maxProfit);

        //Q2
        VersionComparator versionComparator = new VersionComparator();
        System.out.println(versionComparator.compareVersions("0.1.0", "0.0.1"));
    }
}
