package binarySearch;
import java.util.*;
public class BinarySearch {

    public static int search(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid - 1;
//                start = mid + 1; // descending order
            }
            else if(target > arr[mid]) {
                start = mid + 1;
//                 end = mid - 1; // descending order
            }
            else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int [] arr = {-99, -43, -32, -19, -2, 0, 5, 20, 45, 56, 98, 101};
//        int[] arr = {101, 98, 56, 45, 20, 5, 0, -2, -19, -32, -43, -99}; // descending array
        System.out.print("Enter the number to be searched : ");
        int target = sc.nextInt();
        System.out.print(search(arr, target));
        sc.close();
    }
}