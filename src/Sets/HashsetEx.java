package Sets;

import java.util.Set;

public class HashsetEx {
	public static void main(String[] args) {
		//it does not guarantee any specific order of the elements
		Set<Integer>  set = new java.util.HashSet<>();

		// Add elements to the HashsetEx
		set.add(1);
		set.add(3);
		set.add(5);
		set.add(2);
		set.add(99);
		set.add(0);
		set.add(4);

		// Remove an element from the HashsetEx
		set.remove(4);

		// Print the HashSet
		System.out.println("HashSet: " + set);
	}
}
