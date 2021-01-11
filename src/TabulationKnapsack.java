public class TabulationKnapsack {
    public static void main(String args[])
    {
        int val[] = new int[] { 60, 100, 120 };
        int wt[] = new int[] { 10, 20, 30 };
        int W = 50;
        int n = val.length;
        System.out.println(TabulationknapSack(wt, val,W, n));
    }

    private static int TabulationknapSack(int[] wt, int[] profit, int w, int n) {
        int dp[][] = new int[n+1][w+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= w; j++) {
                if(i == 0 || w == 0)
                    dp[i][j] = 0;
                else if(wt[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = Math.max(dp[i-1][j], profit[i-1]+dp[i-1][j-wt[i-1]]);
            }
        }
        return dp[n][w];
    }


}
