import java.util.HashMap;
import java.util.Map;

public class entrySet {
    public static void main(String[] args){
        HashMap<String, Integer> marks = new HashMap<>();

        marks.put("Sanjana", 93);
        marks.put("Harsh", 82);
        marks.put("Radha", 98);
        marks.put("Sachin", 87);
        marks.put("Vandana", 92);

        // we are pringting key -> value but we will use entrySet()

        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            System.out.println(entry.getKey() + " -> "+ entry.getValue());
        }

        // key and value one after another 
        System.out.println();

        for(Map.Entry<String, Integer> entry : marks.entrySet()){
            System.out.println("Key -> "+ entry.getKey());
            System.out.println("Value -> "+ entry.getValue());
            System.out.println();
        }

    }
}
