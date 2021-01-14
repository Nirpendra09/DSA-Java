public class rodCutting {
    public static void main(String args[])
    {
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int price [] = { 1, 5, 8, 9, 10, 17, 17, 20 };

        // rod length
        int n = 4;
        System.out.println("Maximum Obtainable Value is "+
                maxProfit(price,length, n,length.length));

    }

    public static int maxProfit(int price[],int length[], int maxlen, int n){
        if(n == 0 || maxlen == 0)
            return 0;

        int [][] mem = new int[n+1][maxlen+1];

        if(length[n-1] > maxlen)
            mem[n][maxlen] = maxProfit(price,length,maxlen,n-1);
        else
            mem[n][maxlen] = Math.max(price[n-1] + maxProfit(price, length, maxlen-length[n-1], n),maxProfit(price,length,maxlen,n-1));
        return mem[n][maxlen];

    }
}
