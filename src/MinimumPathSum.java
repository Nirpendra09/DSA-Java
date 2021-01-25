public class MinimumPathSum {
    public static void main(String[] args) {
        int [][] grid = {{1,2,3},{4,5,6}};
        System.out.println(minimumPathSum(grid));
    }

    private static int minimumPathSum(int[][] grid) {
        int row = grid.length;;
        if(row ==0) return 0;
        int col = grid[0].length;

        int dp[][] = new int[row][col];
        dp[0][0] = grid[0][0];

        for (int i = 1; i < row; i++) {
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }

        for (int j = 1; j < col; j++) {
            dp[0][j] = grid[0][j] + dp[0][j-1];
        }

        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
            }
        }
        return dp[row-1][col-1];
    }
}
