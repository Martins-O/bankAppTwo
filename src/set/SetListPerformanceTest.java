package set;

import java.util.*;

public class SetListPerformanceTest {
	private static final int N = 50000;

	public static void main(String[] args) {
		List<Integer> lists = new ArrayList<>();
		for(int i = 0; i < N; i++)
			lists.add(i);
		Collections.shuffle(lists);

		Collection<Integer> sets = new HashSet<>(lists);
		System.out.println("Member test time for hash set is "+ getTestTime(sets) + " milliseconds");
		System.out.println("Remove element time for hash set is " + getRemoveTime(sets) + " milliseconds");

		Collection<Integer> set1 = new LinkedHashSet<>(lists);
		System.out.println("Member test time for hash set is "+ getTestTime(set1) + " milliseconds");
		System.out.println("Remove element time for hash set is " + getRemoveTime(set1) + " milliseconds");

		Collection<Integer> set2 = new TreeSet<>(lists);
		System.out.println("Member test time for hash set is "+ getTestTime(set2) + " milliseconds");
		System.out.println("Remove element time for hash set is " + getRemoveTime(set2) + " milliseconds");

		Collection<Integer> list1 = new ArrayList<>(lists);
		System.out.println("Member test time for hash list is "+ getTestTime(list1) + " milliseconds");
		System.out.println("Remove element time for hash list is " + getRemoveTime(list1) + " milliseconds");

		Collection<Integer> list2 = new LinkedList<>(lists);
		System.out.println("Member test time for hash list is "+ getTestTime(list2) + " milliseconds");
		System.out.println("Remove element time for hash list is " + getRemoveTime(list2) + " milliseconds");
		}
	public static  long getTestTime(Collection<Integer> c){
		long startTime = System.currentTimeMillis();

		for(int i = 0; i < N; i++)
			c.contains((int)(Math.random() * 2 * N));
		return System.currentTimeMillis() - startTime;
	}

	public static long getRemoveTime(Collection<Integer> c){
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < N; i++)
			c.remove(i);

		return System.currentTimeMillis() - startTime;
	}
}
