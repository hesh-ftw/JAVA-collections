package Maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapEx {

    public static void main(String[] args) {
        SortedMap<String, Integer> numbers = new TreeMap<String, Integer>();

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("three",3);

        System.out.println(numbers);

        System.out.println(numbers.firstKey());
        System.out.println(numbers.lastKey());
        System.out.println(numbers.remove("One"));
    }
}