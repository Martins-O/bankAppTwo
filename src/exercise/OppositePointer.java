package exercise;

import java.util.Arrays;

public class OppositePointer {

    public static int[] getPointer(int[] arr, int target){
        int start = 0;
        int end = arr.length -1;
        int[] result = new int[2];

        while(start < end){
            int sum = arr[start] + arr[end];
            if (sum == target){
                result[0] = arr[start];
                result[1] = arr[end];
                break;
            }else if (sum < target){
                start++;
            }else
                end--;
        }
        return result;
    }


    public static void main(String[] args) {
        int[] arr = {-3, 2, 3, 3, 6, 8, 15};
        int target = 6;
        System.out.println(Arrays.toString(getPointer(arr, target)));
    }
}
