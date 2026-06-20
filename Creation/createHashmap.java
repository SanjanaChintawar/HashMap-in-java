import java.util.HashMap;
// import package

public class createHashmap{
    public static void main(String[] args){
        // creation of hashmap
        HashMap<Integer, String> students = new HashMap<>();

        // Adding data
        students.put(101, "Sanjana");
        students.put(104, "Harsh");
        students.put(103, "Radha");
        students.put(102, "Mahi");

        // Print Hashmap
        System.out.println(students);

    }
}
