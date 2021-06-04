package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class MyBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size] ;
        MyBubbleSort object = new MyBubbleSort();
        System.out.println("Sorted Array ------>>"+ Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr){
        /**
         *  Time Complexity of this bubble sort algorithm is O(n^2)
         */
        // Step 1 of the algorithm is given below
        for (int i = 0; i < arr.length; i++) {
            /**
             * this loop will run the times the array of length
             * i.e it will ru nn times
             */


            
        }
    }
}