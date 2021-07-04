package com.Coding_Blocks;

import java.util.Scanner;

public class pattern_numbers_and_stars_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR= in.nextInt();
        int num=RR;
        int nst=1;
        int row=1;
        while (row<=RR){
            int cnum=1;
            while(cnum<=num){
                System.out.print(cnum+" ");
                cnum++;
            }
            int cst=1;
            while(cst<=nst){
                if(row==1){
                    cst++;
                }
                else{
                    System.out.print("* ");
                    cst++;

                }

            }
            System.out.println();
            if(row>1){
                nst+=2;
            }

            num--;
            row++;
        }
    }
}
