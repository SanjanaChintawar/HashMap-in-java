
import java.util.HashMap;

public class nonRepeat {
    public static void main(String[] args) {
        String str = "aabcbbbd";

        HashMap<Character, Integer> map = new HashMap<>();

        // frequency count of charactor
        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }
        System.out.println(map);

        for(Character ch: map.keySet()){
            if(map.get(ch) == 1){
                System.out.println("First non-repeating charactor is " + ch);
                break;
            }
        }
    }
}
