package Matrices;

public class diagonalSum {
    public static void main(String[] args){
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {1, 2, 3, 4},
                {5, 6, 7, 8},
        };
        System.out.println(DiagonalSum(matrix, 4));
    }

    public static int DiagonalSum(int[][] matrix, int n){
        int principalSum = 0;
        int secondarySum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == j){
                    principalSum += matrix[i][j];
                }
                if(i + j == (n - 1)){
                    secondarySum += matrix[i][j];
                }
            }
        }
        System.out.println("Principal Diagonal Sum : " + principalSum);
        System.out.println("Secondary Diagonal Sum : " + secondarySum);
        return principalSum + secondarySum;
    }
}
