package cohort13;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        System.out.println("numbers:: "+ numbers);
        List<Integer> list = new Vector<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(numbers.containsAll(list));
        System.out.println(numbers.contains(1));
        System.out.println(numbers.get(2));
    }
}
