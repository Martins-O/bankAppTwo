package exercise;

public class Searching {

    public static int getSearch(int[] list, int searchingNumber){
        for (int i = 0; i < list.length; i++) {
            if (list[i] == searchingNumber){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list = {23, 45, 66, 87, 100, 109};
        int search = 87;
        System.out.println(getSearch(list, search));
    }
}
