package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("chamath");
        list.add("heshan");
        list.add("perera");

        System.out.println(list);
        for (String value : list) {
            System.out.println(value);
        }
        list.remove(1);
        System.out.println(list);
    }
}