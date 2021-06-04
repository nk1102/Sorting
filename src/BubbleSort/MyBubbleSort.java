package BubbleSort;

import java.util.Arrays;
import java.util.Scanner;

public class MyBubbleSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] arr = new int[size];
        MyBubbleSort object = new MyBubbleSort();
        System.out.println("Sorted Array ------>>" + Arrays.toString(arr));
    }

    public void bubbleSort(int[] arr) {
        /**
         *  Time Complexity of this bubble sort algorithm is O(n^2)
         */
        // Step 1 of the algorithm is given below
        for (int i = 0; i < arr.length; i++) {

            // step 2 of the algorithm is given below
            for (int j = 0; j < arr.length - 1; j++) {

                // step 3 of the algorithm is given below
                if (arr[j] > arr[j + 1]) {  // this if statement will check the element and element+1 and swap them if previous one is lower in size
                    //step 3.1 swapping of condition if the if statement is true
                    System.out.println("Swapping ----> " + arr[j]"with--->" + arr[j + 1]);
                    //Swapping operation performed below
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;


                } else {
                    System.out.println("No swap");

                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("after" + (i + 1) + "pass");
            System.out.println(Arrays.toString(arr));


        }
    }
}