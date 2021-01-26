public class MCMTabulation {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4};
        int size = arr.length;

        System.out.println(
                "Minimum number of multiplications is "
                        + MatrixChainOrder(arr, size));
    }

    private static int MatrixChainOrder(int[] arr, int n) {
        int dp[][] = new int[n][n];
        int  j;
        for ( int i = 1; i < n; i++) {
            dp[i][i] = 0;
        }

        //cl --> chain length
        for (int cl = 2; cl < n; cl++) {
            for (int i = 1; i < n-cl+1; i++) {
                j = i + cl - 1;
                if(j == n)
                    continue;
                for (int k = i; k < j; k++) {
                    int count = dp[i][k]+dp[k+1][j]+arr[i-1]*arr[k]*arr[j];
                    if(count < dp[i][j])
                        dp[i][j] = count;
                }
            }
        }
        return dp[1][n - 1]; 
    }
}
