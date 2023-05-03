package CyclicSort;

import java.util.*;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

/*
*To find the missing number in the array
*The intuition:
* => If the number is not in its right index, swap the values. For example, for a given range [1,n],
*    if the value 7 is not in its right index, that is, 6th index, swap the values.
*
* => This program also handles duplicates. If there is a duplicate, the value of 'i' increments.
* => How do we know which are the missing numbers in the array?
*       > incorrect index
*       > if there was number that belong to that index, it should have been there. Since its not, it is missing
*         hence return the index;
* */
public class FindTheDisappearedNumber {

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static List<Integer> finder(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        List<Integer> finalAnswer = new ArrayList<>();
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j + 1){
                finalAnswer.add(j + 1);
            }
        }
        return finalAnswer;
    }

    public static void main(String[] args){

        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> result = finder(arr);
        System.out.println(result);
    }
}
