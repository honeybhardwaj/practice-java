package com.Coding_Blocks;

import java.util.Scanner;

public class factorial_recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number:");
        int n = in.nextInt();

        System.out.println("factorial of "+n+" is "+factorial(n));
    }
    public static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n*factorial(n-1);
    }
}
