package binarySearch;

import java.util.*;
public class Recursion{

    public static int search(int[] arr, int target, int start, int end){

        if(start > end){
            return -1;
        }

        int mid = start + (end - start) / 2;
        if(target == arr[mid]){
            return mid;
        }

        if(target < arr[mid]){
            return search(arr, target, start, mid - 1);
        }

        return search(arr, target, mid + 1, end);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int [] arr = {-99, -43, -32, -19, -2, 0, 5, 20, 45, 56, 98, 101};
//        int[] arr = {101, 98, 56, 45, 20, 5, 0, -2, -19, -32, -43, -99}; // descending array
        System.out.print("Enter the number to be searched : ");
        int target = sc.nextInt();
        System.out.print(search(arr, target, 0, arr.length - 1));
        sc.close();
    }
}
