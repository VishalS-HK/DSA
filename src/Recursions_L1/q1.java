package Recursions_L1;

public class q1 {
    public static void main(String[] args){
//        fun(5);
//        funRev(5);
        funBoth(5);
    }

    public static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n - 1);
    }

    public static void funRev(int n){
        if(n == 0){
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }

    public static void funBoth(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        funBoth( n - 1);
        System.out.println(n);
    }
}
