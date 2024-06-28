package Lists;

import java.util.Vector;

public class VectorEx {

        public static void main(String[] args) {

            Vector<String> vector = new Vector<>();

            System.out.println(vector.size());

            vector.add("Programming");
            vector.add("Networking");
            vector.add("Database");
            vector.add("Deployment");
            vector.add("Cloud Services");

            System.out.println(vector);

            System.out.println(vector.size());

            // Remove an element from the Vector
            vector.remove((String) "Database"); // Remove element by value
            vector.remove(0); // Remove element by index


            System.out.println(vector);

            System.out.println(vector.size());

            vector.clear();

            System.out.println(vector.size());
    }
}
