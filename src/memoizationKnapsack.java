import java.util.Arrays;

public class memoizationKnapsack {
    public static void main(String args[]) {
        int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int W = 50;
        int n = val.length - 1;
        int[][] mem = new int[W+ 1][n + 1];
        for (int[] row : mem)
            Arrays.fill(row, -1);

        System.out.println(knapSack(wt, val, W, n,mem));
    }

    static int knapSack(int[] wt, int[] profit, int w, int n,int[][]mem) {

        if (n == 0 || w == 0) return 0;

        if (mem[w][n] != -1) return mem[w][n];

        int res;
        if (wt[n] > w)
            res = knapSack(wt, profit, w, n - 1,mem);
        else
            res = Math.max(knapSack(wt, profit, w, n - 1,mem), (profit[n] + knapSack(wt, profit, w - wt[n], n - 1,mem)));

        return mem[w][n] = res;
    }
}
