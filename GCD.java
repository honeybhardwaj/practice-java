package com.company;

import java.util.Scanner;

public class GCD {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int div=2,ans=1;
        while(num1>=div && num2>=div){
            if(num1%div==0 && num2%div==0){
                num1/=div;
                num2/=div;
                ans*=div;
            }
            else{
                div++;
            }
        }
        System.out.println(ans);
    }
}
