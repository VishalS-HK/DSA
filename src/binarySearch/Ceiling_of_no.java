package binarySearch;
//point to be noted : if the question has a sorted array, blindly apply binary search
import java.util.*;
public class Ceiling_of_no {
    //ceiling  : smallest element in the array greater or equal to the target
    public static int ceiling(int[] arr, int target){
        //but what if the target is greater than the greatest element in the array?

        if(target > arr[arr.length - 1]){
            return -1;
        }

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
        return start;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        System.out.print("Enter the number to be searched : ");
        int target = sc.nextInt();
        System.out.print(ceiling(arr, target));
        sc.close();
    }
}
