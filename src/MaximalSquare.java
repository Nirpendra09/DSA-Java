public class MaximalSquare {
    public static void main(String[] args) {
        String[][] matrix = {{"0", "1"}, {"1", "0"}};
        System.out.println(maximalSquare(matrix));
    }

    private static int maximalSquare(String[][] matrix) {
        int row = matrix.length;
        if (row == 0) return 0;
        int col = matrix[0].length;

        int[][] dp = new int[row + 1][col + 1];
        int largest = 0;

        for (int i = 0; i <= row; i++) {
            dp[i][0] = 0;
        }
        for (int j = 0; j <= col; j++) {
            dp[0][j] = 0;
        }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                if (matrix[i - 1][j - 1].equals("1")) {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], Math.min(dp[i][j - 1], dp[i - 1][j - 1]));
                    if (largest < dp[i][j])
                        largest = dp[i][j];
                }
            }

        }
        return largest*largest;
    }
}
