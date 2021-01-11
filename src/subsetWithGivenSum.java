import java.util.HashMap;
import java.util.Map;

public class subsetWithGivenSum {
    public static void main(String[] args) {
        int arr[] = { 10, 2, -2, -20, 10};
        int n = arr.length;
        int x = -10;

        System.out.println(findCount(arr, x, n));
    }

    private static int findCount(int[] nums,  int k, int n) {
        HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();

        int count = 0,sum = 0;

        for(int i = 0; i < nums.length; i++){
            map.put(sum,map.getOrDefault(sum,0)+1);
            sum += nums[i];
            if(map.containsKey(sum - k)) count+= map.get(sum-k);
        }
        return count;
    }
}
