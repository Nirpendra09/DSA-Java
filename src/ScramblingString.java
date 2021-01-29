import java.util.*;

public class ScramblingString {


    private static final HashMap<String, Boolean> map = new HashMap<>();

    public static void main(String[] args) {
        String s1 = "a", s2 = "a";
        System.out.println(isScrambling(s1, s2));

    }

    private static boolean isScrambling(String s1, String s2) {
        int n = s1.length();
        if (s1.equals(s2)) return true;

        String key = s1 + s2;
        if (map.containsKey(key))
            return map.get(key);

        for (int i = 1; i < n; i++) {
            if (isScrambling(s1.substring(0, i), s2.substring(0, i)) && isScrambling(s1.substring(i), s2.substring(i))
                    || (isScrambling(s1.substring(0, i), s2.substring(n - i)) && isScrambling(s1.substring(i), s2.substring(0, n - i)))) {
                map.put(key, true);
                return map.get(key);
            }

        }
        map.put(key, false);
        return map.get(key);

    }
}
