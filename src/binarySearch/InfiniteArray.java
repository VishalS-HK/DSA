package binarySearch;
//https://www.youtube.com/watch?v=W9QJ8HaRvJQ&list=PL9gnSGHSqcnr_DxHsP7AW9ftq0AtAyYqJ&index=16
/*note: when the array is said to be of infinite length, it means we don't know the proper bounds.
*
* Just make sure you don't use arr.length to find the array length.
* We need to find the start and end index
* */

import java.util.*;
public class InfiniteArray {

    public static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        // find the range 1st
        // first start with size 2
        while(target > arr[end]){
            int temp = end + 1;
            //double the size of box
            // end = previousEnd + sizeofbox * 2;
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr, target, start, end);
    }

    public static int binarySearch(int[] arr, int target, int start, int end){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            }
            else if(target > arr[mid]){
                start = mid + 1;
            }
            else{
                 return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(ans(arr, target));
    }
}
