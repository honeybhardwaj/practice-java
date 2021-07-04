package com.Coding_Blocks;

import java.util.Scanner;

public class matrix_search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int [][] arr= new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=in.nextInt();
            }
        }
        int target = in.nextInt();
        int i =0;
        int j =m-1;
        int flag=0;
        while(i<n && j>=0 ){
            if(arr[i][j]==target){
                flag=1;
                break;
                }
            else if(arr[i][j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        System.out.println(flag);
    }
}
