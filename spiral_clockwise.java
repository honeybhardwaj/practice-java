package com.Coding_Blocks;

import java.util.Scanner;

public class spiral_clockwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int [][] arr= new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int count=0;
        int mincol=0;
        int minrow=0;
        int maxrow=m-1;
        int maxcol=n-1;
        while(count<m*n){
            for(int i=mincol;i<=maxcol;i++){
                System.out.print(arr[minrow][i]);
                count++;
            }
            for(int i=minrow+1;i<=maxrow;i++){
                System.out.print(arr[i][maxcol]);
                count++;
            }
            for(int i=maxcol-1;i>=mincol;i--){
                System.out.print(arr[maxrow][i]);
                count++;
            }
            for(int i=maxrow-1;i>minrow;i--){
                System.out.print(arr[i][mincol]);
                count++;
            }
            minrow++;
            mincol++;
            maxcol--;
            maxrow--;
        }
        System.out.print("END");
    }

}
