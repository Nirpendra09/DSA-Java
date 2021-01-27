public class bitsFlipped {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(FlippedSetBits(a,b));
    }

    private static int FlippedSetBits(int a, int b) {
        return countSetBits(a^b);
    }

    private static int countSetBits(int n) {
        int count = 0;
        while (n != 0){
            count++;
            n = n&(n-1);
        }
        return count;
    }
}
