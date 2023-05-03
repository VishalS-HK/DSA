package binarySearch.TwoDarr;
import java.util.*;
public class CountNegatives {
    public static void main(String[] args){
        int[][] matrix = {
                {4, 3, 2, -1},
                {3, 2, 1, -1},
                {1, 1, - 1, -2},
                {-1, -1, -2, -3},
        };
        int result = countNegatives(matrix);
        System.out.println(result);
    }

    public static int countNegatives(int[][] matrix){
        int row = matrix.length;
        int column = matrix[0].length;
        int count = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(matrix[i][j] < 0){
                    count++;
                }
            }
        }
        return count;
    }
}