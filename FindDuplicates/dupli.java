
import java.util.HashMap;

public class dupli {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1,4,5,1,5};

        HashMap<Integer, Integer> freq = new HashMap<>();

        // lets count frequency first
        for(int num : arr){
            freq.put(num, freq.getOrDefault(num, 0)+1);
        }
        System.out.println(freq);

        for(Integer k : freq.keySet()){
            if(freq.get(k) > 1){
                System.out.println("Duplicate: "+ k);
            }
        }
        
    }
}
