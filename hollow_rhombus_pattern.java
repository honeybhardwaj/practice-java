package com.Coding_Blocks;

import java.util.Scanner;

public class hollow_rhombus_pattern {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int RR= in.nextInt();
        int nsp=RR-1;
        int nst=RR;
        int row = 1;
        while(row<=RR){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }

            int cst=1;
            while (cst<=nst){
                if(row==1||row==RR||cst==1||cst==nst){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                cst++;
            }
            System.out.println();
            nsp--;
            row++;
        }
    }
}
