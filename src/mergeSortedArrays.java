import java.util.Arrays;

public class mergeSortedArrays {
    public static void main(String[] args)
    {
        int arr1[] = new int[]{1, 5, 9, 10, 15, 20};
        int arr2[] = new int[]{2, 3, 8, 13};
        merge(arr1,arr2,arr1.length,arr2.length);
        System.out.print("After Merging \nFirst Array: ");
        System.out.println(Arrays.toString(arr1));
        System.out.print("Second Array:  ");
        System.out.println(Arrays.toString(arr2));
    }

    static void merge(int[] arr1, int[] arr2, int m, int n){
        for(int i = n -1; i >= 0; i--){
            int j, last = arr1[m-1];
            for(j = m-2; j >= 0 && arr1[j] > arr2[i]; j--){
                arr1[j] = arr1[j];
            }

            if(j != m-1 || last > arr2[i]){
                arr1[j+1] = arr2[i];
                arr2[i] = last;
            }
        }
    }

}
