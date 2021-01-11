import java.util.Scanner;

public class LargestContiguousSumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("method 1 --> "+ContiguousSubarray(arr));
        System.out.println("method 2 --> "+maxSubArraySum(arr));
    }

    //method 1
    static int ContiguousSubarray(int arr[]) {
        int max_ending_here = 0;
        int max_so_far = 0;

        for (int i = 0; i < arr.length; i++) {
            max_ending_here = max_ending_here+arr[i];
            if(max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if(max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }

    //method2
    static int maxSubArraySum(int arr[])
    {
        int max_so_far = arr[0];
        int max_ending_here = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max_ending_here = Math.max(arr[i],max_ending_here+arr[i]);
            max_so_far = Math.max(max_so_far,max_ending_here);
        }
        return max_so_far;
    }
}
