package CyclicSort;

//https://leetcode.com/problems/find-all-duplicates-in-an-array/https://leetcode.com/problems/find-all-duplicates-in-an-array/
//Microsoft, Amazon
import java.util.*;

public class FindAllDuplicatesInAnArray {

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correctIndex = nums[i] - 1;
            if(nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{
                i++;
            }
        }
        List<Integer> finalAnswer = new ArrayList<>();
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j + 1){
                finalAnswer.add(nums[j]);
            }
        }
        return finalAnswer;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1}; //ans = [2,3]
//        int[] arr = {1,1,2}; // ans = [1]
        findDuplicates(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("Output : "+findDuplicates(arr));
    }
}