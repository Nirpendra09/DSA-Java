public class TrailingZeroes {
    public static void main(String[] args) {
        int A = 8;
        System.out.println(solve(A));
    }

    public static int solve(int A) {

        if(A > 0){
            A = A ^ (A-1);
            return (int)(Math.log(A)/Math.log(2));

        }
        return 0;

    }
}
