
import java.util.HashMap;

public class twosum {
    public static void main(String[] args){
        int[] arr ={6,11,7,15,2,3};
        int target = 9;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++){
            int comp = target - arr[i];

            if(map.containsKey(comp)){
                System.out.println("Two sum indices: "+ map.get(comp) + "," + i);
                break;
            }
            map.put(arr[i], i);
        }
    }
}
