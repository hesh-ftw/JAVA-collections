package Maps;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

    public static void main(String[] args) {

        LinkedHashMap<String, Integer> evenNumbers = new LinkedHashMap<String, Integer>();
        //add elements to the linked hash map

        evenNumbers.put("TWO", 2);
        evenNumbers.put("FOUR", 4);
        System.out.println(evenNumbers);


        LinkedHashMap<String, Integer> numbers = new LinkedHashMap<String, Integer>();
        numbers.put("SIX", 6);
        System.out.println(numbers);

        //here, if the adding number is already exist in the hashmap it won't add to the hashmap
        numbers.putIfAbsent("SIX", 6);
        numbers.putIfAbsent("EIGHT", 8);
        System.out.println(numbers);

    }

}