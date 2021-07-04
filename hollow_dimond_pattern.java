package com.Coding_Blocks;

import java.util.Scanner;

public class hollow_dimond_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int row=1;
        int nst=RR/2+1;
        int nsp=0;
        while(row<=RR){
            int cst=1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int val=1;
            if(row==1||row==RR){
                val=2;
            }
            while(val<=nst){
                System.out.print("*");
                val++;
            }
            System.out.println();
            if(row<=RR/2){
               nst--;
               if(row==1){
                   nsp++;
               }
               else{
                   nsp+=2;
               }

            }
            else {
               nst++;
                if(row==RR){
                    nsp--;
                }
                else{
                    nsp-=2;
                }
            }
            row++;

        }
    }
}
