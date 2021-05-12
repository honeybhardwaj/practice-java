package com.company;

import java.util.Scanner;

public class shopping_game {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testcase=in.nextInt();
        while(testcase>0){
            int m = in.nextInt();
            int n = in.nextInt();
            int counter=1;
            while(m>0 && n>0){
                m-=counter;
                if(m<0){
                    break;
                }
                n-=(counter+1);
                if(n<0){
                    break;
                }
                counter+=2;
            }
            if(m<0){
                System.out.println("Harshit");
            }
            else{
                System.out.println("Aayush");
            }
            testcase--;
        }
    }
}
