public class swapUsingBIT {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        swap(x, y);

    }

    private static void swap(int x, int y) {
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("After swap: x = " + x + " y =" + y);
    }
}
