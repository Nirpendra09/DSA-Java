import java.util.TreeSet;

public class MinDeviation {
    public static void main(String[] args) {
        int[]nums = {4,1,5,20,3};
        System.out.println(minimumDeviation(nums));
    }

    private static int minimumDeviation(int[] nums) {
        TreeSet<Integer> temp = new TreeSet<>();
        for(int i : nums){
            if(i % 2 == 0){
                temp.add(i);
            }
            else{
                temp.add(i*2);
            }
        }
        int minDev = temp.last() - temp.first();
        int m = 0;
        while (temp.size() > 0 && temp.last() % 2 == 0){
            m = temp.last();
            temp.remove(m);
            temp.add(m/2);

            minDev = Math.min(minDev, temp.last() - temp.first());
        }
        return minDev;
    }
}
