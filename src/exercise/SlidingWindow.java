package exercise;

public class SlidingWindow {

    public static int sub(int[] list, int range){
        int maxSum = 0;
        for(int i = 0; i <= list.length-range; i++){
            int currentSum = 0;
            for(int j = i; j < i+range; j++){
                currentSum += list[j];
            }
            if (currentSum > maxSum){
                maxSum = currentSum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[] list = {4,9,12,13,2,1,0,9,12,13};
        int range = 3;
        System.out.println(sub(list, range));
    }

}
