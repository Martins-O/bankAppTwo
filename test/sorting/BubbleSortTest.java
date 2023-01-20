package sorting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

	private BubbleSort sort;

	@Test
	@BeforeEach
	public void setUp() {
		sort = new BubbleSort();
	}

	@Test
	public void sortUsingBubbleSort(){
		int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};
		int[] expected = {-2, 1, 2, 2, 3, 3, 5, 6, 12, 14};
		assertArrayEquals(expected, BubbleSort.bubbleSort(list));
	}

	@Test
	public void sortUsingBubbleSortTwo(){
		int[] list = {45, 11, 50, 59, 60, 2, 4, 7, 10};
		int[] expected = BubbleSort.bubbleSort(list);
		assertArrayEquals(expected, BubbleSort.bubbleSort(list));
	}

}