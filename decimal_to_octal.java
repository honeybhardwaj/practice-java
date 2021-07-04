package com.Coding_Blocks;

import java.util.Scanner;

public class decimal_to_octal {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int ans=0, count=0, digit;
        while(num>0){
            digit = num%8;
            ans= (int) (ans+digit*Math.pow(10,count));
            num=num/8;
            count++;
        }
        System.out.println(ans);

    }
}
