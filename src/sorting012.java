import java.util.Scanner;

public class sorting012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sort012(arr, n);
        System.out.println("Sorted");
        print(arr);
    }

/*
    static void sort012(int []arr, int low, int high){
        int mid = (low + high)/2;
        int temp;

        while(mid <= high){
            if(arr[mid] == 0){
                temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else mid++;
        }

    }
*/

    static void sort012(int[] arr, int n) {
        int i, count0 = 0, count1 = 0, count2 = 0;

        for (i = 0; i <n ; i++) {
            switch (arr[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;
            }

        }
        i = 0;

        while (count0 > 0){
            arr[i++] = 0;
            count0--;
        }

        while (count1 > 0){
            arr[i++] = 1;
            count1--;
        }

        while (count2 > 0){
            arr[i++] = 2;
            count2--;
        }

    }

    static void print(int[] arr) {
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
