package exercise;

import java.util.HashSet;
import java.util.Set;

public class No1 {
	public static void main(String[] args) {
		Set<String> sets = new HashSet<>();
		sets.add("George");
		sets.add("Jim");
		sets.add("John");
		sets.add("Blake");
		sets.add("Kevin");
		sets.add("Michael");

		System.out.println("Sets : " + sets);

		Set<String> set = new HashSet<>();
		set.add("George");
		set.add("Katie");
		set.add("Kevin");
		set.add("Michelle");
		set.add("Ryan");

		System.out.println("set : " + set);

	}
}
