package com.company;

import java.util.Scanner;

public class nth_fibonnaci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int n1=0;
        int n2=1;
        int temp;
        if(n==0){
            temp=0;
        }
        else{
            temp=0;
        }
        for(int i =2 ; i<=n;i++){
            int x=n1+n2;
            n1=n2;
            n2=x;
        }
        temp=n2;
        System.out.println(temp);
    }
}
