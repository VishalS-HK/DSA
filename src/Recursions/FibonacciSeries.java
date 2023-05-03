package Recursions;

import java.util.*;
public class FibonacciSeries {

    public static int series(int n){
        if(n == 0){
            return 0;
        }

        if(n == 1 || n == 2){
            return 1;
        }

        return (series(n - 2) + series(n - 1));
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the nth element : ");
        int n = sc.nextInt();
        int i;
        for(i = 0; i < n; i++){
            System.out.print(series(i) + " ");
        }
        sc.close();
    }
}