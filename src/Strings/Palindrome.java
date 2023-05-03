package Strings;

import java.util.*;
public class Palindrome {

    public static boolean palindromeChecker(String s){

        if(s == null || s.length() == 0){
            return true;
        }
        s = s.toLowerCase();
        int i;
        for(i = 0; i < s.length() / 2; i++){
            char start = s.charAt((i));
            char end = s.charAt(s.length() - 1 - i);

            if(start != end){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String s;
        System.out.print("Enter a string to check if it is a Palindrome or not : ");
        s = sc.next();
//        String s = "";
        System.out.println(palindromeChecker(s));
        sc.close();
    }
}