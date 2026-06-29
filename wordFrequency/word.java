
import java.util.HashMap;
import java.util.Map;

public class word {
    public static void main(String[] args) {
        String sentence = "Java is fun Java is easy and powerful Learning Java with HashMap is fun because HashMap makes many problems easy. and Java Java Java helps improve programming skills.";
        // Remove punctuation 
        sentence = sentence.replaceAll("[^a-zA-Z ]", "");
        String[] words = sentence.split(" ");

        HashMap<String, Integer> freq = new HashMap<>();

        for(String word : words){
            freq.put(word, freq.getOrDefault(word, 0)+1);
        }

        for(Map.Entry<String, Integer> entry : freq.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

    }
}
