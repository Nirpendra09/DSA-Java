public class MaximumSumIncreasingSubsequence {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 101, 2, 3, 100, 4, 5};
        int n = arr.length;
        System.out.println("Sum of maximum sum "+
                "increasing subsequence is "+
                maxSumIS(arr, n));
    }

    private static int maxSumIS(int[] arr, int n) {

        int []msis = new int[n];

        for (int i = 0; i < n; i++) {
            msis[i] = arr[i];
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if(arr[i] > arr[j] && msis[i] < arr[i]+msis[j])
                    msis[i] = arr[i]+msis[j];
            }
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            if(msis[i] > max)
                max = msis[i];
        }

        return max;
    }
}
