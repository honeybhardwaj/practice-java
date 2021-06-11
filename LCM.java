package com.company;

import java.util.Scanner;

public class LCM {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int lcm= num1*num2 / GCD(num1,num2);
        System.out.println(lcm);

    }
    public static int GCD(int num1, int num2){
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
        return (ans);
    }
}
