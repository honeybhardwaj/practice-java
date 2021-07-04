package com.Coding_Blocks;

import java.util.Scanner;

public class octal_to_binary {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int num=in.nextInt();
        int ans=0, count=0, digit;
        while(num>0){
            digit = num%10;
            ans= (int) (ans+digit*Math.pow(8,count));
            num=num/10;
            count++;
        }
        num=ans;
        ans=0;
        count=0;
        while(num>0){
            digit = num%2;
            ans= (int) (ans+digit*Math.pow(10,count));
            num=num/2;
            count++;
        }
        System.out.println(ans);

    }
}
