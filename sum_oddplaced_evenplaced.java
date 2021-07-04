package com.Coding_Blocks;

import java.util.Scanner;

public class sum_oddplaced_evenplaced {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        int pos=1;
        long oddsum=0,evensum=0;
        while(num>0){
            int digit=(int) num%10;
            if(pos % 2 == 0){
                evensum+=digit;
            }
            else{
                oddsum+=digit;
            }
            pos++;
            num=num/10;
        }
        System.out.println(oddsum);
        System.out.println(evensum);
    }
}
