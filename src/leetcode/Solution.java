package leetcode;

public class Solution {
    public static int[] shuffle(int[] nums, int divisionSort) {
        int[] sort = new int[2 * divisionSort];
        int firstPointer = 0;
        int secondPointer = divisionSort;
        for(int i = 0; i < sort.length; i++){
            if(i % 2 == 0){
                sort[i] = nums[firstPointer];
                firstPointer++;
            }else{
                sort[i] = nums[secondPointer];
                secondPointer++;
            }
        }
        return sort;
    }
}
