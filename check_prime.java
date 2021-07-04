package com.Coding_Blocks;

import java.util.Scanner;

public class check_prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long num= in.nextLong();
        int flag=0;
        for(int i = 2 ; i<num;i++){
            if(num % i ==0){
                 flag=1;
                 break;
            }
        }
        if(flag==1){
            System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }
    }
}
