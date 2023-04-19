package exercise;

public class Reverse {

    public char[] reverse(char[] arr) {
        char[] temp = new char[0];
        for (int i = arr.length - 1; i >= 0; i--) {
            temp = new char[]{arr[i]};
        }
        return temp;
    }
}
