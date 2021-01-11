public class minimumDiffSubset {
    public static void main (String[] args)
    {
        int arr[] = {3, 1, 4, 2, 2, 1};
        int n = arr.length;
        System.out.println ("The minimum difference between 2 sets is "
                + findMin(arr, n));

    }

    private static int findMin(int[] arr, int n) {
       int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        boolean [][]dp = new boolean[n+1][sum+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if(i == 0)
                    dp[i][j] = false;
                if(j == 0)
                    dp[i][j] = true;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if(arr[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
            }
        }

        int k = 0;
        for (int i = 0; i <= sum/2; i++) {
            int first = i;
            int second = sum - i;
            if(dp[n][i] == true || k > Math.abs(first - second))
                k = Math.abs(first - second);
        }
        return k;
    }
}
