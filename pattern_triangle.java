package com.Coding_Blocks;

import java.util.Scanner;

public class pattern_triangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int row=1;
        int nsp=RR-1;
        int nst =1;
        while (row<=RR){
            int csp=1;
            while(csp<=nsp){
                System.out.print("\t");
                csp++;
            }

            int cst=1;
            int num=row;
            while(cst<=nst){
                if (cst< nst/2+1){
                    System.out.print(num+"\t");
                    num++;
                }
                else{
                    System.out.print(num+"\t");
                    num--;
                }
                cst++;
            }
            System.out.println();
            nsp--;
            nst+=2;
            row++;
        }
    }
}
