package InsertionSort;

import java.util.Arrays;

public class MyInsertionSort {
    public static void main(String[] args) {
        int arr[] = {10, 23, 45, 522, 24};
        System.out.println("Unsorted -->" + Arrays.toString(arr));
        //Created object of the class
        MyInsertionSort object = new MyInsertionSort();
        object.insertionSort(arr);

        System.out.println("Sorted -->"+Arrays.toString(arr));
    }
        public void insertionSort(int arr[]){
            // step 1 of the algorithm
            // created a variable and initialised it with 0
            int sortedIndex=0;
            //step 2 of the algorithm
            for (int unsortedIndex = 0; unsortedIndex < arr.length; unsortedIndex++) {
                //Step 3 of the algorithm
                int nextElement = arr[unsortedIndex];
                System.out.println("next Element -->"+ nextElement);
                //Step 4 of the algorithm
                for (int j =unsortedIndex;j>0;j--){
                    // Step 5 of the algorithm
                    if(arr[j] <arr[j-1]){
                        System.out.println("Swapping -->"+arr[j] + "with--->"+arr[j-1]);
                        //Step 6 of the algorithm
                        int temp =arr[j];
                        arr[j]=arr[j-1];
                        arr[j-1]=temp;

                    }
                    else{
                        System.out.println("breaking because --->"+ arr[j]+"is greater than  or equal to --->"+arr[j-1]);
                        break;
                    }
                }
            }
        }

}
