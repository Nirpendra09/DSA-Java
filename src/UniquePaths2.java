public class UniquePaths2 {
    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,0,0},{0,1,0},{0,0,0}};
        System.out.println(uniquePathsWithObstacles(obstacleGrid));
    }

    public static int uniquePathsWithObstacles(int[][] obstacleGrid) {

        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        boolean flag = false;

        int dp[][] = new int[row][col];

        for(int i = 0 ; i< row; i++){
            if(flag || obstacleGrid[i][0] == 1){
                flag = true;
                dp[i][0] = 0;
            }
            else
                dp[i][0] = 1;
        }

        flag = false;
        for(int j = 0; j < col; j++){
            if(flag || obstacleGrid[0][j] == 1){
                flag = true;
                dp[0][j] = 0;
            }
            else
                dp[0][j] = 1;
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(obstacleGrid[i][j] != 1){
                    dp[i][j] = dp[i-1][j]+dp[i][j-1];
                }
            }
        }
        return dp[row-1][col-1];
    }
}
