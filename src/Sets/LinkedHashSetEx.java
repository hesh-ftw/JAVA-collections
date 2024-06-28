package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
        // Maintains insertion order. Elements are ordered in the sequence they were inserted.
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();

        // Add elements to the LinkedHashSet
        set.add(1);
        set.add(3);
        set.add(40);
        set.add(41);
        set.add(22);
        set.add(15);


        // Remove an element from the LinkedHashSet
        set.remove(4);

        // Print the LinkedHashSet
        System.out.println("LinkedHashSet: " + set);
    }
}
