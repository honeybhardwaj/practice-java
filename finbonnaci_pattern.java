package com.Coding_Blocks;

import java.util.Scanner;

public class finbonnaci_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int row=1;
        int num1=0;
        int num2=1;
        while(row<=RR){
            int cst=1;
            while(cst<=row){
                int f=num1+num2;
                num1=num2;
                if (row==1||row==2){
                    System.out.print(row-1);
                }

                else{
                    System.out.print(f+"\t");

                    num2=f;
                }


                cst++;

            }
            System.out.println();
            row++;


        }
    }
}
