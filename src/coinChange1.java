public class coinChange1 {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        System.out.println(noOfCoins(coins, amount));
    }

    public static int noOfCoins(int[] coins, int amount) {
        int n = coins.length;
        int dp[][] = new int[n + 1][amount + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= amount; i++) {
            dp[0][i] = Integer.MAX_VALUE - 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] <= j)
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                else
                    dp[i][j] = dp[i - 1][j];
            }
        }
        return dp[n][amount] != Integer.MAX_VALUE - 1 ? dp[n][amount] : -1;
    }
}
