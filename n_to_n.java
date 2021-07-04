package com.Coding_Blocks;

import java.util.Scanner;

public class n_to_n {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int sb=in.nextInt();
        int db=in.nextInt();
        int num=in.nextInt();
        int ans=0, count=0, digit;
        if (sb == 10 ||db==10){
            while(num>0){
                digit = num%db;
                ans= (int) (ans+digit*Math.pow(sb,count));
                num=num/db;
                count++;
            }

        }
        else{
            while(num>0){
                digit = num%10;
                ans= (int) (ans+digit*Math.pow(sb,count));
                num=num/10;
                count++;
            }
            num=ans;
            ans=0;
            count=0;
            while(num>0){
                digit = num%db;
                ans= (int) (ans+digit*Math.pow(10,count));
                num=num/db;
                count++;
            }
        }

        System.out.println(ans);

    }
}
