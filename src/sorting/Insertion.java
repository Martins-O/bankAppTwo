package sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Insertion {

	public int[] insertSort(int[] sort){
		int currentElement = 0;
		//checking through the list
		for(int index = 0; index < sort.length; index++) {
//			create temporary variable to store the elements
			currentElement = sort[index];
			//checking and inserting the element into order arrangement
			int element;
			for(element = index - 1; element >= 0 && sort[element]
				> currentElement ; element--) {
				sort[element + 1] = sort[element];
			}
			//insert the element into currentElement
			sort[element + 1] = currentElement;
		}
		return sort;
	}
}
