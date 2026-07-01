
import java.util.HashMap;

public class freqNums {
    public static void main(String[] args){
        int[] arr = {1,1,2,3,2,4,1,3,2,2,4,3,3,3,5};

        // lets create a HashMap
        // num -> freq count
        HashMap<Integer, Integer> freq = new HashMap<>();

        // lets count the freqency
        for(int num : arr){
            // if(freq.containsKey(num)){
            //     freq.put(num, freq.get(num)+1);
            // }
            // else{
            //     freq.put(num, 1);
            // }
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        System.out.println(freq);
        
    }
}
