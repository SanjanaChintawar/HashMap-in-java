
import java.util.HashMap;
import java.util.Map;

public class duplicateWord {
    public static void main(String[] args) {
        String str = "Java is fun Java is easy and powerful Learning Java with HashMap is fun because HashMap makes many problems easy. and Java Java Java helps improve programming skills.";  
        str = str.replaceAll("[^a-zA-Z ]", "");

        String[] words = str.split(" ");

        HashMap<String, Integer> map = new HashMap<>();

        // frequncy count of words

        for(String word: words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }

        // traverse the hashmap
        System.out.println("Duplicates words: ");
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1){
                System.out.println(entry.getKey());
            }
        }

        
    }
}
