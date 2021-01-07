import java.util.Scanner;

public class DuplicatNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int nums[] = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(nums));

    }

    public static int findDuplicate(int nums[]) {
        int arr[] = new int[nums.length+1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;

            if(arr[nums[i]] > 1) return nums[i];
        }
        return 0;
    }
}
