package CyclicSort;

//https://leetcode.com/problems/set-mismatch/description/
import java.util.*;
public class SetMismatch {

    public static int[] findErrorNums(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int currentIndex = nums[i] - 1;
            if(nums[i] != nums[currentIndex]){
                swap(nums, i, currentIndex);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                return new int[] {nums[j], j + 1};
            }
        }
        return new int[] {-1, -1};
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
}
