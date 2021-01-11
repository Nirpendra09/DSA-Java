public class PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int arr[] = { 3, 1, 1, 2, 2, 1 };
        int n = arr.length;
        if (findPartition(arr, n) == true)
            System.out.println(
                    "Can be divided into two  subsets of equal sum");
        else
            System.out.println(
                    "Can not be divided into two subsets of equal sum");
    }

    private static boolean findPartition(int[] arr, int n) {
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        if(sum % 2 != 0) return false;

        boolean[][] dp = new boolean [n+1][sum/2 + 1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= sum/2; j++) {
                if(i == 0 || j == 0)
                    dp[i][j] = false;
                else if(arr[i-1] > j)
                    dp[i][j] = dp[i-1][j];
                else if(arr[i-1] == j)
                    return true;
                else
                    dp[i][j] = dp[i-1][j] || dp[i-1][j-arr[i-1]];
            }
        }
        return dp[n][sum/2];
    }
}
