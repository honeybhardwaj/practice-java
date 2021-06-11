package com.company;

import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int ans=0, count=0, digit;
        while(num>0){
            digit = num%10;
            ans= (int) (ans+digit*Math.pow(2,count));
            num=num/10;
            count++;
        }
        System.out.println(ans);

    }
}
