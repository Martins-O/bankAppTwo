package exercise;

import java.util.Arrays;

public class BubbleSort {

    public static void getSort(int[] list){
        boolean swapped = false;
        for (int i = 0; i < list.length; i++) {
            for (int j = 1; j < list.length-i; j++) {
                if (list[j] < list[j-1]) {
                   int temp = list[j];
                   list[j] = list[j-1];
                   list[j-1] = temp;
                   swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        getSort(list);
        System.out.println(Arrays.toString(list));
    }
}
