package com.Coding_Blocks;

import java.util.Scanner;

public class piyush_magicalpark {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        int s = in.nextInt();
        int [][] arr= new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                arr[i][j] = in.next().charAt(0);
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0;j<m;j++){
                if(arr[i][j] == '.'){
                    if(j==m-1){
                        s-=2;
                    }
                    else{
                        s-=3;
                    }
                }
                if(arr[i][j] == '#'){
                    break;
                }
                if(arr[i][j] == '*') {
                    if (j == m - 1) {
                        s += 5;
                    }
                    else {
                        s += 4;
                    }
                }
            }
        }

        if(s>=k){
            System.out.println("Yes");
            System.out.println(s);
        }
        else{
            System.out.println("No");
        }
    }
}
