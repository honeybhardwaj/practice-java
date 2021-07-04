package com.Coding_Blocks;

import java.util.*;
public class Manmohan_loves_pattern_2 {
    public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            int RR = in.nextInt();
            int nst=1;
            int row=1;
            while(row<=RR){
                int cst=1;
                while(cst<=nst){
                    if(cst==nst){
                        if(nst==1){
                            System.out.print(cst);
                        }
                        else{
                            System.out.print(cst-1);
                        }
                    }
                    else if(cst ==1){
                        System.out.print(nst-1);
                    }
                    else{
                        System.out.print(0);
                    }
                    cst++;
                }
                System.out.println();
                row++;
                nst++;
            }
        }
    }
