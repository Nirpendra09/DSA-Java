public class BurstBalloons {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 1, 5, 8};
        System.out.println(maximumCoins(nums));
    }

    private static int maximumCoins(int[] nums) {
        int n = nums.length;
        int[]A = new int[n+2];
        for (int i = 1; i <= n; i++) {
            A[i] = nums[i-1];
        }
        A[0] = A[n+1] = 1;
        int [][]dp = new int[n+2][n+2];
        for (int i =0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                dp[i][j] = 0;
            }
        }


        for (int i = 1; i <= n; i++) {
            for(int j = i; j >= 1; j--){
                for(int k = j; k <= i; k++){
                    dp[j][i] = Math.max(A[j-1]*A[k]*A[i+1]+dp[j][k-1]+dp[k+1][i], dp[j][i]);
                }
            }
        }
        return dp[1][n];
    }

}
