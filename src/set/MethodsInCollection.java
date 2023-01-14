package set;

import java.util.HashSet;
import java.util.Set;

public class MethodsInCollection {
	public static void main(String[] args) {
		Set<String> sets = new HashSet<>();

		sets.add("London");
		sets.add("Paris");
		sets.add("New York");
		sets.add("San Francisco");
		sets.add("Beijing");

		System.out.println("sets is " + sets);
		System.out.println(sets.size() + " elements in sets");

		sets.remove("London");
		System.out.println("\nsets is " + sets);
		System.out.println(sets.size() + " elements in sets");

		Set<String> set1 = new HashSet<>();
		set1.add("London");
		set1.add("Shanghai");
		set1.add("Paris");
		System.out.println("\nset1 is " + set1);
		System.out.println(set1.size() + " elements in sets");

		System.out.println("\nIs Taipei in set1? " + set1.contains("Taipei"));

		sets.addAll(set1);
		System.out.println("After adding sets to set1, " + sets);

		sets.removeAll(set1);
		System.out.println("\nAfter removing set1 from sets, sets is " + sets);

		sets.retainAll(set1);
		System.out.println("After retaining common elements in set1 "+ "and set1, sets is " + sets);
	}
}
