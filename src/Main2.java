//import java.util.*;
//
//public class Main2{
//
//    public static int removeDuplicates(int[] n){
//        int x = 1;
//        for(int i = 1; i < n.length; i++){
//            if(n[i - 1] != n[i]){
//                n[x] = n[i];
//                x++;
//            }
//        }
//        return x;
//    }
//
//
//    public static void main(String[] args){
//        int[] arr = {0,0,1,1,1,2,2,3,3,4};
//        int res = removeDuplicates(arr);
//        System.out.print(res);
//    }
//}

class Solution{
    public static void main(String[] args){
        boolean res = validPerfectSquare(25);
        System.out.println(res);
    }

    public static boolean validPerfectSquare(int num){
        int start = 1;
        int end = num;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(num == mid * mid){
                return true;
            }
            else if(num < mid * mid){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}