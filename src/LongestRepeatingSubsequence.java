public class LongestRepeatingSubsequence {
    public static void main(String[] args) {
        String str = "aabb";
        System.out.println("The longest repeating subsequence is : "+findLongestRepeatingSubSeq(str));
    }

    static String findLongestRepeatingSubSeq(String str){
        int n = str.length();
        String dp[][] = new String[n+1][n+1];

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if(i == 0 || j == 0)
                    dp[i][j] = "";
                else if(str.charAt(i-1) == str.charAt(j-1) && i != j)
                    dp[i][j] = dp[i-1][j-1] + str.charAt(i-1);
                else
                    dp[i][j] = dp[i-1][j].length() > dp[i][j-1].length() ? dp[i-1][j] : dp[i][j-1];
            }
        }
        return dp[n][n];
    }
}
