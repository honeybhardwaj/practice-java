package com.company;

import java.util.Scanner;

public class pattern_with_zeroes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int row=1;
        int num=1;
        while(row<=RR){
            int cst=1;
            while(cst<=num){
                if(cst==1||cst==num){
                    System.out.print(row);
                    cst++;
                }
                else{
                    System.out.print(0);
                    cst++;
                }
            }
            System.out.println();
            num++;
            row++;
        }
    }
}
