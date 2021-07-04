package com.Coding_Blocks;

import java.util.Scanner;

public class pattern_hourglass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int row=1;
        int num=RR;
        int nsp=0;
        while(row<=2*RR+1){
            if(row<RR+1){
                int csp=1;
                while(csp<=nsp){
                    System.out.print("  ");
                    csp++;
                }

                int cst=1;
                int temp=num;
                while(cst<=num){
                    System.out.print(temp+" ");
                    cst++;
                    temp--;
                }
                System.out.print(0+" ");
                int cst1=1;
                int temp1=1;
                while(cst1<=num){
                    System.out.print(temp1+" ");
                    cst1++;
                    temp1++;
                }
                System.out.println();
                num--;
                row++;
                nsp++;
            }
            else{
                int csp=1;
                while(csp<=nsp){
                    System.out.print("  ");
                    csp++;
                }

                int cst=1;
                int temp=num;
                while(cst<=num){
                    System.out.print(temp+" ");
                    cst++;
                    temp--;
                }
                System.out.print(0+" ");
                int cst1=1;
                int temp1=1;
                while(cst1<=num){
                    System.out.print(temp1+" ");
                    cst1++;
                    temp1++;
                }
                System.out.println();
                num++;
                row++;
                nsp--;
            }
        }
    }
}
