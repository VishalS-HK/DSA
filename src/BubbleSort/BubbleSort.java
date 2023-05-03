package BubbleSort;

import java.util.Arrays;

public class BubbleSort {

    public static void bubbleSort(int[] arr){

        boolean swapped; 
        //run the steps n - 1 times
        for(int i = 0; i < arr.length; i++){
            swapped = false;
            //for each step, max item will come at the last respective address
            for(int j = arr.length - 1; j > i; j--) {
                //swap if the current element is smaller than the previous one
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            // if you did not swap for a particular value of i, that means the arrays is sorted,
            // hence stop the program.

            if(swapped == false){ // if(!swapped)
                break;
            }
        }
    }

    public static void main(String[] args) {

//        int[] arr = {1, 0, 1 ,0, 1};
        int[] arr = {3,4,5,2,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
