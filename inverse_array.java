package com.company;

import java.util.Scanner;

public class inverse_array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        int [] ans = new int[n];
        int i;
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(i=0;i<n;i++){
            ans[arr[i]]=i;
        }
        for( int j : ans){
            System.out.print(j+" ");
        }
    }
}
