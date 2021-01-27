public class OddEvenBIT {

    public static void main(String[] args) {
        int n = 1236;
        System.out.println("Using Xor -> " + (isEvenXor(n) ? "Even" : "Odd"));
        System.out.println("Using And -> " + (isEvenAnd(n) ? "Even" : "Odd"));
        System.out.println("Using Or -> " + (isEvenOr(n) ? "Even" : "Odd"));
    }

    //using OR
    private static boolean isEvenOr(int n) {
        return (n | 1) > n;
    }

    //using AND
    private static boolean isEvenAnd(int n) {
        return ((n & 1) != 1);
    }

    //using xor
    private static boolean isEvenXor(int n) {
        return (n ^ 1) == n + 1;
    }


}
