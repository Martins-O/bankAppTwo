package exercise;

public class BinarySearching {

    public static int binarySearch(int[] list, int target){
        int start = 0;
        int end = list.length - 1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (list[middle] > target) {
               end = middle -1;
            } else if (list[middle] < target) {
                start = middle + 1;
            }
            else return middle;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] list = {23, 45, 66, 87, 100, 109};
        int search = 87;
        System.out.println(binarySearch(list, search));
    }
}
