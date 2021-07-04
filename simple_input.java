package com.Coding_Blocks;

import java.util.Scanner;

public class simple_input{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int input;

        while(sum>=0){
            input=in.nextInt();
            sum+=input;
            if(sum<0){
                continue;
            }
            System.out.println(input);

        }
    }
}
