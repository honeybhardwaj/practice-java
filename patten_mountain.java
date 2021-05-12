package com.company;

import java.util.Scanner;

public class patten_mountain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int row=1;
        int num=1;
        int nsp=2*RR-3;
        while(row<=RR){
            int cst=1;
            while(cst<=num){
                System.out.print(cst+"\t");
                cst++;
            }

            int csp=1;
            while(csp<=nsp){
                System.out.print("\t");
                csp++;
            }
            int val=row;
            while(val>0){
                if (val==RR){
                    val--;
                    System.out.print(val+"\t");
                }
                else{
                    System.out.print(val+"\t");
                }
                val--;
            }
            System.out.println();
            nsp-=2;
            row++;
            num++;
        }
    }
}
