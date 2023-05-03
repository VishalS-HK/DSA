package Recursions_L1;
public class SumOfDigits {
    public static void main(String[] args){
        System.out.println(SOD(123));
    }

    public static int SOD(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + SOD(n / 10);
    }
}