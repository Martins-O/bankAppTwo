package exercise;

public class Sliding {

    public static int sliding(int[] list, int range){
        int maxSum = 0;
        int currentSum = 0;
        for(int i = 0; i < list.length-range; i++){
            currentSum += list[i];
            if (i >= range) {
                currentSum -= list[i - range];
            }
            if (i >= range - 1 && currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
//        int[] list = {4,9,12,13,2,1,0,9,12,13};
        int[]  list = {
                3, 9, 4, 12, 2, 1, 13
        };
        int range = 3;
        System.out.println(sliding(list, range));
    }
}
