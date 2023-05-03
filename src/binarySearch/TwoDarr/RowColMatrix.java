package binarySearch.TwoDarr;

import java.util.*;
public class RowColMatrix {

    public static int[] search(int[][] matrix, int target){
        int row = 0;
        int column = matrix.length - 1;


        while(row < matrix.length && column >= 0){

            //case 1: if element == target

            //case 2: element < target; if an element of a particular row is less than the target element,
            // isn't it safe to say that the other elements of that very row are also smaller than the target?

            //case 3: element > target;

            if(matrix[row][column] == target){
                return new int[]{row, column};
            }
            else if(matrix[row][column] < target){
                row++;
            }
            else{
                column--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int [][] matrix= {
//            {10, 20, 30, 40},
//            {15, 25, 35, 45},
//            {28, 29, 37, 49},
//            {33, 34, 38, 50}
//        };
        int[][] matrix = {
                {1, 3}
        };
        System.out.print("Enter the number to be searched : ");
        int target = sc.nextInt();
        System.out.println(Arrays.toString(search(matrix, target)));
        sc.close();
    }
}
