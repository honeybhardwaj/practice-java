package com.company;

import java.util.Scanner;

public class consersion_ftoc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt();
        int max=in.nextInt();
        int step=in.nextInt();
        for(int i=min; i<=max; i+=step){
            int c = (5*(i-32))/9;
            System.out.println(i+" "+c);
        }
    }
}
