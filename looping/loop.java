import java.util.HashMap;

public class loop{
    public static void main(String[] args){
        HashMap<Integer, String> students = new HashMap<>();

        students.put(101, "Sanjana");
        students.put(102, "Harsh");
        students.put(103, "Radha");
        students.put(104, "Mahi");
        students.put(105, "Vandana");
        students.put(106, "Sachin");

        // keySet() in looping
        System.out.println("Keys");
        for(Integer key : students.keySet()){
            System.out.println(key);
        }

        // print key and value together 
        System.out.println();
        System.out.println("keys -> Values");
        for(Integer key: students.keySet()){
            System.out.println(key + " -> " + students.get(key));
        }

        // values() in looping
        System.out.println();
        System.out.println("Values");
        for(String value : students.values()){
            System.out.println(value);
        }

        


    }
}