package set;

import java.util.HashSet;
import java.util.Set;

public class HashTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		set.add("Martins");
		set.add("John");
		set.add("Victoria");
		set.add("Lagos");
		System.out.println(set);
		for(String sets: set) {
			System.out.println(sets.toUpperCase() + " ");
		}
		System.out.println();
		set.forEach(e -> System.out.print(e.toLowerCase() + " "));
	}
}
