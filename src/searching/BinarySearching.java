package searching;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearching {

    public static int searching(int[] list, int key) {
        int start = 0;
        int end = list.length - 1 ;
        int middle = (start + end + 1) / 2;
        int location = -1;

        do{
            System.out.println(remainElements(list, start, end));

            for (int index = 0; index < middle; index++){
                System.out.println(" ");
            }

            System.out.println(" * ");

            if (key == list[middle]){
                location = middle;
            }else if (key < list[middle]) {
                end = middle - 1;
            }
            else {
                start = middle + 1;
            }

            middle = (start + end + 1)/2;
        }while((start <= end ) && (location == -1));

        return location;
    }

    private static String remainElements(int[] list, int start, int end){
        StringBuilder temporary = new StringBuilder();

        for (int elements = 0; elements < start; elements++) {
            temporary.append(" ");
        }
        for (int remElements = start; remElements <= end ; remElements++) {
            temporary.append(list[remElements]).append(" ");
        }

        return String.format("%s%n",temporary);
    }

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        SecureRandom generator = new SecureRandom();

        int[] list = generator.ints(15,10,91).sorted()
                .toArray();
        System.out.printf("%s%n%n", Arrays.toString(list));

        System.out.print("Please enter an integer value (-1 to quit)=> ");
        int searchElements = user.nextInt();

        while (searchElements != -1) {
            int location = searching(list, searchElements);

            if (location == -1) {
                System.out.printf("%d was not found%n%n", searchElements);
            }else {
                System.out.printf("%d was found in position %d%n%n", searchElements, location);
            }
            System.out.println("Please emter an integer value (-1 to quit)=> ");
            searchElements = user.nextInt();
        }

//        int[] list = new int[10];
//        for (int element = 0; element < list.length; element++) {
//            list[element] = 10 + generator.nextInt(90);
//        }
//        System.out.println(Arrays.toString(list)+"\n");
//
//        System.out.println("Enter the searching key => ");
//        int user_Input = user.nextInt();
//
//        System.out.println(searching(list, user_Input));
    }

}
