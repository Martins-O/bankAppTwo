package exercise;

import java.util.Arrays;

public class BinarySearchWith2DArray {

    public static int[] search(int[][] list, int target){
        int []result = new int[2];
        for (int row = 0; row < list.length  ; row++){
            for (int column = 0; column < list[row].length; column++){
                if (list[row][column] == target){
                    result[0] = row;
                    result[1] = column;
                    return result;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] list = {{1,2,3},{2,5,4},
                {78,9,67}, {45,77,33}};
        int target = 45;
        System.out.println((Arrays.toString(search(list, target))));
    }
}
