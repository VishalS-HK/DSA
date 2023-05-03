package CyclicSort;

//Amazon
//https://leetcode.com/problems/find-the-duplicate-number/description/
import java.util.*;
public class FindTheDuplicateNumber {

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int cyclicSort(int[] arr){
        int i = 0;
        while(i < arr.length){
            if(arr[i] != i + 1){
                int correctIndex = arr[i] - 1;
                if(arr[i] != arr[correctIndex]){
                    swap(arr, i, correctIndex);
                }
                else{
                    return arr[i];
                }
            }
            else{
                i++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2}; //ans = 2
//        int[] arr = {3,1,3,4,2}; // ans = 3
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The duplicate number is : "+cyclicSort(arr));
    }
}
