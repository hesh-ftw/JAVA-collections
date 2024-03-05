package Maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer,String> map= new HashMap<Integer, String>();

        // insert key and value pairs

        map.put(100, "chamath ");
        map.put(200, "heshan ");
        map.put(300, "java ");
        map.put(400, "kdu ");
        map.put(500, "perera ");

        //travers the entry set that we have
        for(Map.Entry<Integer,String> m: map.entrySet()){
            System.out.println(m.getKey()+ ":"+ m.getValue());
        }

        //get value of a particular key
        String value= map.get(101);
        System.out.println(value);

        //get keysets and values
        System.out.println(map.keySet());
        System.out.println(map.values());

        // get complete key value pair
        System.out.println(map.entrySet());

        //remove element
        map.remove(300);
        System.out.println(map.entrySet());



    }

}
