package com.Coding_Blocks;

import java.util.Scanner;

public class Lower_Upper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.next().charAt(0);
        if(a>=65 && a<=90){
            System.out.println("UPPERCASE");
        }
        else if(a>=97 && a<=122){
            System.out.println("lowercase");
        }
        else{
            System.out.println("Invalid");
        }
    }
}
