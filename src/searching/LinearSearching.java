package searching;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearching {

    public static int searching(int[] list, int searchingElement){
        for(int index = 0; index < list.length; index++) {
            if (list[index] == searchingElement){
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] list = new int[10];
        for (int element = 0; element < list.length; element++) {
            list[element] = 10 + generator.nextInt(90);
        }
        System.out.println(Arrays.toString(list)+"\n");

        System.out.println("Enter an integer value or press -1 to quit => ");
        int user = userInput.nextInt();
        while(user != -1){

            int position = searching(list, user);

            if (position == -1){
                System.out.println("The Element was not found!");
            }
            else {
                System.out.println(user + " was found at index " + position);
            }
            System.out.println("Enter an integer value or press -1 to quit => ");
            user = userInput.nextInt();
        }
    }
}
