package array;

public class Search {

    public static int getSearch(int[] list, int number){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == number){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        int number = 8;
        System.out.println(getSearch(numbers, number));
    }

}
