
import java.util.HashMap;

public class common {
    public static void main(String[] args) {
        // find common elemnt in two arrays
        int[] arr1 = {2,3,4,5,7,8};
        int[] arr2 ={1,3,4,6,9,0,2};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr1.length; i++){
            map.put(i+1, arr1[i]);
        }

        for(int a : arr2){
            if(map.containsValue(a)){
                System.out.println(a);
            }
        }
    }
}
