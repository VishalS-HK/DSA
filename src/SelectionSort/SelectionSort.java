package SelectionSort;

import java.util.Arrays;

public class SelectionSort {

    public static void selectionSort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            // find the max element in the array and swap with correct index
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);

            swap(arr, maxIndex, last);
        }
    }

    /**
     * It returns the index of the maximum value in the array.
     *
     * @param arr the array to be sorted
     * @param start the starting index of the array
     * @param end the last index of the array
     *
     * @return The index of the largest value in the array.
     */
    public static int getMaxIndex(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[max] < arr[i]){
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

//        int[] arr = {-1, 32, 89, 0 , 7};
        int[] arr = {20, 12 , 10, 15, 2};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
