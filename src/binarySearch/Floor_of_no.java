package binarySearch;

import java.util.Scanner;

public class Floor_of_no {
    //floor  : greatest element in the array less than or equal to the target
    public static int floor(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

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
        return end;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.print("Enter the number to be searched : ");
        int target = sc.nextInt();
        System.out.print(floor(arr, target));
        sc.close();
    }
}
