import java.util.Arrays;

public class smallestString {
    public static void main(String[] args) {
        int n = 5;
        int k = 73;
        System.out.println(getSmallestString(n,k));
    }

    static String getSmallestString(int n, int k){
        char[] c = new char[n];
        Arrays.fill(c,'a');
        k-=n;

        while(k>0) {
            c[--n] += Math.min(25,k);
            k-=25;
        }

        return new String(c);
    }
}
