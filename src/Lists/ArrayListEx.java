package Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();

        // Add elements to the ArrayList
        arrayList.add("A");
        arrayList.add("C");
        arrayList.add("D");

        // Print the ArrayList before removal using forEach
        System.out.print("ArrayList before removal: ");
        arrayList.forEach(element -> System.out.print(element + " "));
        System.out.println();

        // Remove an element from the ArrayList
        arrayList.remove("D");

        // Print the ArrayList after removal using forEach
        System.out.print("ArrayList after removal: ");
        arrayList.forEach(element -> System.out.print(element + " "));
        System.out.println();

    }
}
