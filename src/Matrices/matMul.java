package Matrices;
import java.util.*;
public class matMul {
    public static void main(String[] args){
        int[][] arr1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8},
        };

        int[][] arr2 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8},
        };

        int[][] res = matrixMul(arr1, arr2);
        System.out.println("Ans : " + Arrays.deepToString(res));
    }

    public static int[][] matrixMul(int[][] arr1, int[][] arr2){
        int n = arr1.length;
        int[][] c = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                c[i][j] = 0;
                for(int k = 0; k < n; k++){
                    c[i][j] = c[i][j] + arr1[i][k] * arr2[k][j];
                }
            }
        }
        return c;
    }
}
