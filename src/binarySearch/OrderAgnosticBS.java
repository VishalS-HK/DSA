package binarySearch;

import java.util.*;
public class OrderAgnosticBS {

    public static int OrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
            else{
                if(target > arr[mid]){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
//        int [] arr = {-99, -43, -32, -19, -2, 0, 5, 20, 45, 56, 98, 101};//ascending array
        int[] arr = {101, 98, 56, 45, 20, 5, 0, -2, -19, -32, -43, -99};
        System.out.print("Enter the number to be searched : ");
        int target = sc.nextInt();
        System.out.print(OrderAgnostic(arr, target));
        sc.close();
    }
}