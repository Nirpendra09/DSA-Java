import java.util.Arrays;

public class CompetitiveSubsequence {
    public static void main(String[] args) {
        int nums[] = {3,5,2,6};
        int k = 2;

        System.out.println(Arrays.toString(mostCompetitive(nums, k)));
    }

    private static int[] mostCompetitive(int[] nums, int k) {
        int []stack = new int[k];

        for (int i = 0, j = 0; i < nums.length; i++) {
            while (j > 0 && stack[j-1] > nums[i] && j+ nums.length-i > k)
                j--;
            if(j < k){
                stack[j++] = nums[i];
            }

        }
        return stack;
    }
}
