public class PatternMatching {
    public static void main(String[] args) {
        String p = "AAB";
        String s = "ABBAB";
        System.out.println(findPatern(p,s));
    }

    static boolean findPatern(String p, String s){
        int len1 = s.length();
        int len2 = p.length();
        String dp [][] = new String[len1+1][len2+1];

        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if(i == 0 || j == 0)
                    dp[i][j] = "";
                else if(s.charAt(i-1) == p.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1] + s.charAt(i-1);
                else
                    dp[i][j] = dp[i-1][j].length() > dp[i][j-1].length() ? dp[i-1][j] : dp[i][j-1];
            }
        }
        return p.equals(dp[len1][len2]);
    }
}
