package task;

public class Multiply {
	
	public int multiplyWithoutAsterisk(int a, int b){
		boolean isNegative = (a < 0 && b > 0) || (a > 0 && b < 0);
		int result = 0;
		for (int i = 0; i < b; i++) {
			result += a;
		}
		return isNegative ? -result : result;
	}
}
