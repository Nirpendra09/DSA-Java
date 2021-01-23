import java.util.Arrays;

public class RussianDollEnvelopes {
    public static void main(String[] args) {
        int[][] envelop = {{5, 4}, {6, 4}, {6, 7}, {2, 3}};
        System.out.println(maxEnvelop(envelop));
    }

    private static int maxEnvelop(int[][] envelop) {
        int n = envelop.length;
        if (n == 0) return 0;
        Arrays.sort(envelop, (a, b) -> Integer.compare(a[0], b[0]));

        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int res = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (envelop[i][0] > envelop[j][0] && envelop[i][1] > envelop[j][1] && dp[i] < 1+dp[j]) {
                    dp[i] = dp[j]+1;
                    if(res < dp[i])
                        res = dp[i];
                }
            }
        }
        return res;
    }


}
