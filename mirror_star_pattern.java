package com.Coding_Blocks;

import java.util.Scanner;

public class mirror_star_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int nsp= RR -2;
        int nst= 1;
        int row=1;
        while(row<=RR){
            if (row<RR/2+1){
                int csp=1;
                while(csp<=nsp){
                    System.out.print(" \t");
                    csp++;
                }

                int cst=1;
                while(cst<=nst){
                    System.out.print("*\t");
                    cst++;
                }
                System.out.println();
                nsp--;
                row++;
                nst+=2;
            }
            else{
                int csp=1;
                while(csp<=nsp){
                    System.out.print(" \t");
                    csp++;
                }

                int cst=1;
                while(cst<=nst){
                    System.out.print("*\t");
                    cst++;
                }
                System.out.println();
                nsp++;
                row++;
                nst-=2;
            }

        }
    }
}
