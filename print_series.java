package com.Coding_Blocks;

import java.util.Scanner;

public class print_series {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1=in.nextInt();
        int n2=in.nextInt();
        for(int i = 1 ; i <=n1 ; i++){
            int num=3*i+2;
            if(num%n2 != 0){
                System.out.println(num);
            }
            else{
                n1=n1+1;
            }
        }
    }
}
