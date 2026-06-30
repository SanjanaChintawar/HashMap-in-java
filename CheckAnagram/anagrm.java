
import java.util.HashMap;
import java.util.Scanner;



public class anagrm {

    public static void check(String str1, String str2){
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        // frequency count of characters of each string
        for(char ch : str1.toCharArray()){
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }
        for(char ch : str2.toCharArray()){
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        // compare both hashmaps

        if(map1.equals(map2)){
            System.out.println("Anagram");
        } else System.out.println("not an anagram");
    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first string: ");
        String str1 = scanner.next();

        System.out.println();

        System.out.println("Enter second string: ");
        String str2 = scanner.next();

        check(str1, str2);

    }
}
