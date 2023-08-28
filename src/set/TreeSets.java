package set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class TreeSets {
	public static void main(String[] args){
		Set<String> sets = new HashSet<>();

		sets.add("London");
		sets.add("Paris");
		sets.add("Lagos");
		sets.add("New York");
		sets.add("San Francisco");
		sets.add("Beijing");

		TreeSet<String> treeSets = new TreeSet<>(sets);
		System.out.println("sorted tree sets: "+treeSets);
		System.out.println("First() : " + treeSets.first());
		System.out.println("Last() : " + treeSets.last());
		System.out.println("Headsets(\"Lagos\"): " + treeSets.headSet("Lagos"));
		System.out.println("Tailsets(\"Lagos\"): " + treeSets.tailSet("Lagos"));

		System.out.println("Lower(\"P\"): " + treeSets.lower("P"));
		System.out.println("Higher(\"P\"): " + treeSets.higher("P"));
		System.out.println("Floor(\"P\"): "+ treeSets.floor("P"));
		System.out.println("ceiling(\"P\"): "+treeSets.ceiling("P"));
		System.out.println("PollFirst(): "+ treeSets.pollFirst());
		System.out.println("PollLast(): "+ treeSets.pollLast());
		System.out.println("New tree sets: "+treeSets);
	}


}
