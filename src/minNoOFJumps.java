public class minNoOFJumps {
    public static void main(String[] args) {
        int arr[] = {2, 3, 1, 1, 4};
        int n = arr.length;
        System.out.print("Minimum number of jumps to reach end is "
                + minJumps(arr, arr.length));
    }

//    static int minJumps(int arr[], int l, int h){
//        if(l == h) return 0;
//        if(arr[l] == 0) return Integer.MAX_VALUE;
//
//        int min = Integer.MAX_VALUE;
//        for (int i = l+1; i <= h && i <= l+arr[l]; i++) {
//            int jumps = minJumps(arr,i,h);
//            if(jumps != Integer.MAX_VALUE && jumps +1 < min)
//                min = jumps+1;
//        }
//        return min;
//    }

//    static int minJumps(int arr[], int n){
//        int jumps[] = new int[n];
//        if(arr[0] == 0 || n == 0) return Integer.MAX_VALUE;
//
//        jumps[0] = 0;
//
//        for (int i = 1; i < n; i++) {
//            jumps[i] = Integer.MAX_VALUE;
//            for (int j = 0; j < i; j++) {
//                if(i <= j + arr[j] && jumps[j] != Integer.MAX_VALUE){
//                    jumps[i] = Math.min(jumps[i],jumps[j]+1);
//                    break;
//                }
//            }
//
//        }
//        return jumps[n-1];
//    }

    static int minJumps(int arr[], int n) {
        if (n <= 1) return 0;

        if (arr[0] == 0) return -1;

        int maxReach = arr[0];
        int step = arr[0];
        int jump = 1;

        for (int i = 1; i < n; i++) {
            if (i == n - 1) return jump;

            maxReach = Math.max(maxReach, i + arr[i]);
            step--;

            if (step == 0) {
                jump++;
                if (i >= maxReach)
                    return -1;
                step = maxReach - i;
            }
        }
        return -1;
    }
}
