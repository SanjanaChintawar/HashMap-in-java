
import java.util.HashMap;

public class freqEle {
    public static void main(String[] args){
        int[] arr = {1,2,1,3,2,1,4,5,2,1,3};

        HashMap<Integer, Integer> freq = new HashMap<>();

        // we have to find most frquent element 
        // first find frequency count

        for(int num: arr){
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        System.out.println(freq);

        Integer maxFreq = 0;
        Integer key = -1;
        
        for(Integer k: freq.keySet()){
            if(freq.get(k) > maxFreq){
                maxFreq = freq.get(k);
                key = k;
            }
        }
        System.out.println("Most freqent: "+ key);
    }
}
