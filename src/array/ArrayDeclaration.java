package array;

public class ArrayDeclaration {

	public int declare(int number) {
		int[] array = new int[number];
		int value = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = array.length - 1; j >= 0; j--) {
				value = array[i];
			}
		}
		return value;
	}


	public static void main(String[] args) {
		int number;
	}
}
