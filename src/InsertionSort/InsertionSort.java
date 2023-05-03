package InsertionSort;

import java.util.Arrays;

public class InsertionSort {

    public static void insertionSort(int[] arr){

        // the outer for-loop is used to iterate through the array.
        for(int i = 0; i < arr.length - 1 ; i++){
            //inner for-loop is used to check if the lhs is sorted or not.
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j - 1);
                }
                // when the element j is not lesser than j - 1, stop the sorting.
                // this is because the LHS of the array is already sorted.
                else{
                    break;
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int second){

        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

//        int[] arr = {-1, 32, 89, 0 , 7};
        int[] arr = {7, 8, 5, 2, 4, 6, 3};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}