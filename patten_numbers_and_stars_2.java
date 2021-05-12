package com.company;

import java.util.Scanner;

public class patten_numbers_and_stars_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int num=1;
        int row=1;
        while(row<=RR){
            int cnum=1;
            while (cnum<=num){
                System.out.print(cnum);
                cnum++;
            }
            while(cnum<=RR){
                System.out.print("*");
                cnum++;
            }
            System.out.println();
            num++;
            row++;
        }
    }
}
