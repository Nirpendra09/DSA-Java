public class maximumSumCircualrSubarray {
    public static void main(String[] args) {
        int arr[] = {1,-2,3,-2};
        System.out.println(maxSubarraySumCircular(arr));
    }
    public static int maxSubarraySumCircular(int[] A) {
        int max_straight = Integer.MIN_VALUE;
        int temp_max = 0;
        int min_straight = Integer.MAX_VALUE;
        int temp_min = 0;
        int total = 0;

        for(int i = 0 ; i < A.length; i++){

            temp_max += A[i];
            max_straight = Math.max(max_straight, temp_max);

            if(temp_max < 0)
                temp_max = 0;


            total += A[i];

            temp_min += A[i];
            if(temp_min > 0)
                temp_min = 0;

            min_straight= Math.min(min_straight, temp_min);
        }

        if(min_straight == total){
            return max_straight;
        }
        else
            return Math.max(max_straight, total - min_straight);
    }
}
