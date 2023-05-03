import QuickSort.QuickSort;

import java.util.*;

public class QuickSort2{
    public static void main(String[] args){
        int[] arr = {5, 4, 3, 2, 1};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] sort(int[] arr){
        QuickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private static void QuickSort(int[] arr, int low, int high){
        if(low > high)
            return;
        int start = low;
        int end = high;
        int mid = start + (end - start) / 2;
        int pivot = arr[mid];

        while(start <= end){
            while(arr[start] < pivot){
                start++;
            }
            while(arr[end] > pivot){
                end--;
            }
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        QuickSort(arr, low, end);
        QuickSort(arr, start, high);
    }
}