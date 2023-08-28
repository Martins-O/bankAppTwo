package sorting;

public class BubbleSort {
	public static int[] bubbleSort(int[] list) {
		boolean needNextPass = true;

		for(int index = 1; index < list.length && needNextPass; index++) {
			needNextPass = false;
			for(int element = 0; element < list.length - index; element++) {
				if(list[element] > list[element + 1]) {
					int temp = list[element];
					list[element] = list[element + 1];
					list[element + 1] = temp;

					needNextPass = true;
				}
			}
		}
		return list;
	}
}
