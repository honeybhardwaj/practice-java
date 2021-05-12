package com.company;

import java.util.Scanner;

public class pattern_double_sided_arrow {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int nsp=RR-1;
        int nsp1=0;
        int num=1;
        int row=1;
        while(row<=RR){
            int csp=1;
            while(csp<=nsp){
                System.out.print("  ");
                csp++;
            }

            int cnum=num;
            while(cnum>=1){
                System.out.print(cnum+" ");
                cnum--;
            }
            if (row > 1){
                int csp1=1;
                while(csp1<=nsp1) {
                    System.out.print("  ");
                    csp1++;
                }
            }
            if(row>1 && row<RR ){
                cnum++;
                while(cnum<=num){
                    System.out.print(cnum+" ");
                    cnum++;
                }
            }
            System.out.println();
            row++;
            if(row<=RR/2+1){
                num++;
                nsp-=2;
                if(row==1){
                    nsp1=1;
                }
                else{
                    nsp1+=2;
                }

            }
            else{
                num--;
                nsp+=2;
                nsp1-=2;
            }

        }
    }
}
