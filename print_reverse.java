package com.Coding_Blocks;
import java.util.Scanner;

public class print_reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int digit,rev=0;
        while(a>0){
            digit= a%10;
            rev=rev*10+digit;
            a=a/10;
        }
        System.out.println(rev);
    }
}
