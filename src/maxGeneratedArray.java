import java.util.Arrays;

public class maxGeneratedArray {
    public static void main(String[] args) {
        int n = 7;

        System.out.println(getMaxGenerated(n));
    }

    static int getMaxGenerated(int n){
        if(n == 0) return 0;
        if(n == 1) return 1;

        int[]arr = new int[n+1];
        int x = 0;
        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            if( i % 2 == 0){
                x = i/2;
                arr[i] = arr[x];
            }
            else {
                x = (i-1)/2;
                arr[i] = arr[x]+arr[x+1];
            }
        }
        Arrays.sort(arr);

        return arr[n];
    }
}
