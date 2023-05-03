import java.util.*;

public class DutchNationalFlag {

    public static void Dutch(int[] arr){
        int low = 0; // pointer pointing to the 1st element of the array
        int high = arr.length - 1; // pointer pointing to the last element of the array
        int mid = 0;// //  pointer also pointing to the first element to the array

        //the program stops when the mid-pointer is greater than the high-pointer
        while(mid <= high){
            switch (arr[mid]) {
                case 0 -> {
                    swap(arr, low, mid);
                    low++;
                    mid++;
                }
                case 1 -> {
                    mid++;
                }
                case 2 -> {
                    swap(arr, mid, high);
                    high--;
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args){

        int[] arr = {0 ,1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        Dutch(arr);
        System.out.println(Arrays.toString(arr));
    }
}