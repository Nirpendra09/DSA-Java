public class setIthBIT {
    public static void main(String[] args) {
        int x = 8; //the Number - 10000
        int n = 2; //bit number
        setithBit(x,n);
    }

    public static void setithBit(int x,int n){
        int y = 1;
        int mask = 0;
        for (int i = 0; i <= n-1; i++) {
            mask = y << i;
        }
        x = x | mask; // after manipulation - 10010
        System.out.println(x);
    }
}
