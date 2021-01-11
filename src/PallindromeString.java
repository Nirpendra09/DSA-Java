public class PallindromeString {
    public static void main(String[] args) {
        String s = "madam";
        if(reverse(s)){
            System.out.println("Pallindrome");
        }
        else
            System.out.println("Not Pallindrome");
    }

    public static boolean reverse(String s) {
        int n = s.length();
        char ch[] = s.toCharArray();

        int i = 0;
        int j = n - 1;

        while (i <= j) {
            if(ch[i] == ch[j]) {
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
}
