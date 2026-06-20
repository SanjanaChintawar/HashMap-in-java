
import java.util.HashMap;


//Print employee with key 2.
// Check if key 5 exists.
// Remove key 1.
// Print final HashMap.
// Print size.

public class challenge {
    public static void main(String[] args) {
        HashMap<Integer, String> employee = new HashMap<>();

        employee.put(1, "Sanjana");
        employee.put(2, "Harsh");
        employee.put(3, "Radha");
        employee.put(4, "Mahi");
        employee.put(5, "Vandana");
        employee.put(6, "Sachin");
        System.out.println();
        System.out.println(employee);
        System.out.println();
        
        //Print employee with key 2.
        System.out.println("Employee with key 2: "+ employee.get(2));
        System.out.println();

        // Check if key 5 exists.
        System.out.println("Check if key 5 exists: "+ employee.containsKey(5));
        System.out.println();

        // Remove key 1.
        employee.remove(1);
        System.out.println("key 1 removed!!");
        System.out.println();

        // Print final HashMap.
        System.out.println(employee);
        System.out.println();

        // print size 
        System.out.println("Size of HashMap: "+ employee.size());
        System.out.println();



    }    
}
