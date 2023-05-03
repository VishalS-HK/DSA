/*
This approach is regarded as the best as recursion will have overheads of function calls
and there could be potential stack overflows when we've to find larger fibonacci term.
*/

package Recursions;

import java.util.*;
public class nthFibonacci{
    public static void main(String[] args){
        int n = 4;
        System.out.println(fib(n));
    }

    private static int fib(int n){
        if(n < 2)
            return n;
        int a = 1;
        int b = 1;
        for(int k = 2; k < n; k++){
            int temp = a;
            a += b;
            b = temp;
        }
        return a;
    }
}