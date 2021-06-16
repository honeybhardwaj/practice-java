package com.company;

import java.util.Scanner;

public class wavePrint_columnwise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        int [][] arr=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            if(i%2==1){
                for(int j=0;j<n;j++){
                    System.out.print(arr[j][i]);
                }
            }
            else{
                for(int j = n-1;j>=0;j--){
                    System.out.print(arr[j][i]);
                }
            }
        }

    }
}
