public class coinChange2 {
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int amount = 5;
        System.out.println(change(amount,coins));
    }

    public static int change(int amount,int []coins){
        int []dp = new int[amount+1];
        dp[0] = 1;
        for (int i = 0; i < coins.length; i++) {
            for (int j = 1; j <= amount; j++) {
                if(coins[i] <= j){
                    dp[j] += dp[j-coins[i]];
                }
            }
        }
        return dp[amount];
    }
}
