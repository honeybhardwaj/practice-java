package com.company;

import java.util.Scanner;

public class Ganesha_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR= in.nextInt();
        int row=1;
        while(row<=RR){
            int col=1;
            while(col<=RR){
                if(col==RR/2+1||row==RR/2+1){
                    System.out.print("*");
                }
                else if(row==1 && col>RR/2+1 || row==RR && col<RR/2+1 || col==1 && row <RR/2+1 || col== RR && row>RR/2+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                col++;
            }
            System.out.println();
            row++;
        }
    }
}
