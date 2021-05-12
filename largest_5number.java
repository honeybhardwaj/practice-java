package com.company;

import java.util.Scanner;

public class largest_5number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        int num4 = in.nextInt();
        int num5 = in.nextInt();
        if(num1>num2 && num1>num3 && num1 > num4 && num1>num5){
            System.out.println(num1);
        }
        else if(num2 > num3 && num2 > num4 && num2 >num5){
            System.out.println(num2);
        }
        else if(num3 > num4 && num3> num5){
            System.out.println(num3);
        }
        else if(num4 > num5){
            System.out.println(num4);
        }
        else{
            System.out.println(num5);
        }
    }
}
