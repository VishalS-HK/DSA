package binarySearch;

//to find the peak index in a mountain array
//https://leetcode.com/problems/peak-index-in-a-mountain-array/submissions/865158161/
public class PeakIndexMountain {

    public static int peak(int[] arr){
        int start = 0;
        int end = arr.length  - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                //we are in the descending part of the array
                end = mid;
            }
            else{
                //we are in the ascending part of the array
                start = mid + 1;
                // because the mid + 1 element is greater than mid/the current element of the array
            }
        }
        // when start == end, we get the largest element in the array.
        return start;// or return end as start == end
    }
    public static void main(String[] args) {

        int[] arr = {0,10,5,2};
        System.out.println(peak(arr));
    }
}
