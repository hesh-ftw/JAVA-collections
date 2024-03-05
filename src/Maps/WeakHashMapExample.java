package Maps;

import java.util.WeakHashMap;

public class WeakHashMapExample {

    public static void main(String[] args) {
    //create weak hashmap
        WeakHashMap<String, Integer> numbers = new WeakHashMap<String, Integer>();
        numbers.put("ONE", 1);
        numbers.put("TWO", 2);
        numbers.put("THREE", 3);
        System.out.println(numbers);

    //Add new value to the weak hashmap
        String four = new String("FOUR");
        Integer fourValue = 4;

        numbers.put(four, fourValue);
        System.out.println(numbers);


        four = null; //can insert null values and i will see only when the gc added

        System.gc(); //null values performs only when gc added
        System.out.println(numbers);

    }

    }