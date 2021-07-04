package com.Coding_Blocks;

import java.util.Scanner;

public class square_pyramid_pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR= in.nextInt();
        int num=1;
        int row=1;
        while(row<=RR){
            int cnum=1;
            while(cnum<=num){
                System.out.print(cnum*cnum+" ");
                cnum++;
            }
            System.out.println();
            num++;
            row++;
        }
    }
}
