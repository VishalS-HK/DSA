package CyclicSort;

import java.util.Arrays;
//https://leetcode.com/problems/missing-number/
public class MissingNum {

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            // it's not nums[i] - 1 cuz given range is 0-N, not 1-N
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex]){
                swap(nums, i, correctIndex);
            }
            else{i++;
            }
        }

        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j) {
                return j;
            }
        }
        return nums.length;
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] args) {

//        int[] arr = {9,6,4,2,3,5,7,0,1};
        int[] arr = {3,0,1};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The missing element : "+missingNumber(arr));
    }
}