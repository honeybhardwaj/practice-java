package com.Coding_Blocks;

import java.util.Scanner;

public class anticlockrotation_2d {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [][] arr = new int[n][n];

        for(int i =0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
