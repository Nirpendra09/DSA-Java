import java.rmi.MarshalException;

public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 3};
        int n = arr.length;

        System.out.println(
                "Minimum number of multiplications is " + MatrixChainOrder(arr, 1, n - 1));
    }

    //Recursive solution
    private static int MatrixChainOrder(int[] arr, int left, int right) {
        if (left == right)
            return 0;

        int min = Integer.MAX_VALUE;

        for (int k = left; k < right; k++) {
            int count = MatrixChainOrder(arr, left, k) +
                    MatrixChainOrder(arr, k + 1, right) +
                    arr[left - 1] * arr[k] * arr[right];

            if(count < min)
                min = count;
        }
        return min;
    }

}
