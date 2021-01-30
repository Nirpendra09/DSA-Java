public class concatinateBinary {
    public static void main(String[] args) {
        int n = 12;
        System.out.println(concatenatedBinary(n));
    }
    public static int concatenatedBinary(int n) {
        int mod = 1000000007;
        long res = 1;
        int digits = 1;

        for(int i=2; i<=n; i++){
            digits = Integer.toBinaryString(i).length();
            //digits = (i >> digits == 0) ? digits : digits + 1;
            res = res << digits;
            res += i;
            res = res % mod;
        }

        return (int)res;
    }
}
