public class MCMmemoization {


    public static void main(String args[]) {
        int arr[] = new int[]{1, 2, 3, 4, 3};
        int n = arr.length;
        int mem[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mem[i][j] = -1;
            }
        }
        System.out.println(
                "Minimum number of multiplications is "
                        + MatrixChainOrder(arr, 1, n - 1,mem));
    }


    private static int MatrixChainOrder(int[] arr, int left, int right,int[][]mem) {
        if (left == right)
            return 0;
        if (mem[left][right] != -1) return mem[left][right];

        for (int k = left; k < right; k++) {
            mem[left][right] = MatrixChainOrder(arr,left,k,mem)+
                    MatrixChainOrder(arr, k+1, right,mem)+ arr[left-1]*arr[k]*arr[right];

        }
        return mem[left][right];
    }
}
