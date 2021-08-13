package com.Coding_Blocks;

import java.util.Scanner;

public class fibonnacci_recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the number");
        int n = in.nextInt();
        System.out.println(fibon(n));
    }
    public static int fibon(int n){
        if(n==1 || n==0){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int ans = fibon(n-1)+fibon(n-2);
        return ans;
    }


}
