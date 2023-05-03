package CyclicSort;

//https://leetcode.com/problems/first-missing-positive/
//Amazon
public class FirstMissingPositive {

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    public static int firstMissingPositive(int[] arr){
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i] - 1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            }
            else{
                i++;
            }
        }
        for(int j = 0; j < arr.length; j++){ // j is index
            if(arr[j] != j + 1){
                return j + 1;
            }
        }
        return arr.length + 1;
    } 

    public static void main(String[] args) {
//        int[] arr = {3,4,-1,1}; //Output : 2
//        int[] arr = {7,8,9,11,12};// Output: 1
        int[] arr = {-4 ,63, -1, 8, 7, 3, 6};
        System.out.println(firstMissingPositive(arr));
    }
}