package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSets {
	public static void main(String[] args) {
		Set<String> sets = new LinkedHashSet<>();

		sets.add("London");
		sets.add("Paris");
		sets.add("San Francesco");
		sets.add("Beijing");
		sets.add("New York");

		System.out.println(sets);

		for(String set : sets) {
			System.out.print(set.toLowerCase() + " ");
		}

		Set<String> set = new LinkedHashSet<>();
	}
}
