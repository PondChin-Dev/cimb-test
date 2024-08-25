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

        //Q3
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int n = 5;
        System.out.println("n = " + n + " total step: " + climbingStairs.countWays(n));

        //Q4
        //ส่วนตัวคิดว่าข้อที่ 3 ยากสุดเพราะเป็นขอบเขตการนำไปใช้ที่ ส่วนตัวแล้วในการทำงานของผมที่ทำอยู่ไม่ค่อยได้ใช้
        //วิธีที่ใช้แก้ปัญหาถาม gpt แต่ว่าผมเองก็ต้องทำความเข้าใจกับหลักการของ code และที่สำคัญคือพยามหาว่าเอาไปใช้ในเรื่องอะไรได้บ้างกับหลักการทำงานนี้
    }
}
