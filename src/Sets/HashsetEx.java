package Sets;

import java.util.Set;

public class HashsetEx {
	public static void main(String[] args) {

		Set<Integer>  set = new java.util.HashSet<>();

		// Add elements to the HashsetEx
		set.add(1);
		set.add(3);
		set.add(4);

		// Remove an element from the HashsetEx
		set.remove(4);

		// Print the HashSet
		System.out.println("HashSet: " + set);
	}
}
