public class checkStringRotation {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "llohe";

        if(areRotations(s1,s2))
            System.out.println("Strings are rotation of each other");
        else
            System.out.println("Strings are not rotation of each other");
    }

    private static boolean areRotations(String s1, String s2) {
        return (s1.length() == s2.length()) && ((s1+s2).indexOf(s2) != -1);
    }
}
