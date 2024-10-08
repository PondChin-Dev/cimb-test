public class ClimbingStairs {
    public int countWays(int n) {
        // ไม่คำนวน 0 กับ 1 เพราะจะเสียความเร็วและความจำโดยไม่จำเป็น
        if (n == 0) return 1;
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
