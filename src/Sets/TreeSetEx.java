package Sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        //in Tree sets elements are ordered in ascending order
        Set<Integer> set = new TreeSet<>();

        // Add elements to the TreeSet
        set.add(1);
        set.add(11);
        set.add(32);
        set.add(3);
        set.add(43);
        set.add(31);
        set.add(67);
        set.add(0);
        set.add(2);

        // Remove an element from the TreeSet
        set.remove(43);

        // Print the TreeSet
        System.out.println("TreeSet: " + set);
    }
}
