import java.util.Arrays;

public class KsumPair {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int k = 5;

        System.out.println(maxOperations(nums,k));
    }
    public static int maxOperations(int[] nums, int k){
        Arrays.sort(nums);

        int left = 0, right = nums.length-1;
        int count = 0;

        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum == k){
                left++;
                right--;
                count++;
            }
            else if(sum > k){
                right--;
            }
            else{
                left++;
            }
        }
        return count;
    }
}
