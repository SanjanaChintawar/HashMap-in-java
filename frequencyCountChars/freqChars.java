
import java.util.HashMap;

public class freqChars {
    public static void main(String[] args){

        String str = "bananac";
        HashMap<Character, Integer> freq = new HashMap<>();

        for(char ch : str.toCharArray()){ // converted string into an char array

            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        System.out.println(freq);
    }
}
