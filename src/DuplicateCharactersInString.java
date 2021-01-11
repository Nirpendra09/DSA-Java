import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {
    public static void main(String[] args) {
        String S = "HEllo";
        findDuplicate(S);
    }

    public static void findDuplicate(String S){
        Map<Character, Integer> map = new HashMap<Character,Integer>();
        char[] chars = S.toCharArray();

        for (Character ch: chars){
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        Set<Character> keys = map.keySet();

        for(Character ch : keys){
            System.out.println("Char "+ ch+ " "+map.get(ch));
        }

    }
}
