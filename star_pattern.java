package com.company;

import java.util.Scanner;

public class star_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int nsp=RR-1;
        int nst=1;
        int row=1;
        while(row<=RR){
            int csp=1;
            while(csp<=nsp){
                System.out.print(" ");
                csp++;
            }
            int cst=1;
            while(cst<=nst){
                System.out.print("*");
                cst++;
            }
            System.out.println();
            row++;
            nst++;
            nsp--;
        }
    }
}
