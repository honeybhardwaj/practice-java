package com.Coding_Blocks;

import java.util.Scanner;

public class inverse_of_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        int pos=1;
        long fnum=0;
        while(num>0){
            int digit = (int) (num %10);
            fnum= (long) (fnum+pos*Math.pow(10,digit-1));
            pos++;
            num = num/10;
        }
        System.out.println(fnum);
    }
}
