public class UncrossedLines {
    public static void main(String[] args) {
        int []A = {1,4,2};
        int []B = {1,2,4};

        System.out.println("MaxUncrossed lines are "+ maxUncrossedLines(A,B));
    }

    public static int maxUncrossedLines(int[] A, int[] B) {
        int len1 = A.length;
        int len2 = B.length;

        int[][] dp = new int[len1+1][len2+1];

        for(int i = 0; i <= len1; i++){
            for(int j = 0; j <= len2; j++){
                if(i == 0 || j == 0)
                    dp[i][j] = 0;
                else if(A[i-1] == B[j-1])
                    dp[i][j] = dp[i-1][j-1] + 1;
                else
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[len1][len2];
    }
}
