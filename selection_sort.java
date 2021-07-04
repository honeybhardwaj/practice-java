package com.Coding_Blocks;

import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        int i,j;
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(i=0;i<n-1;i++){
            int imin=i;
            for(j=i+1;j<n;j++){
                if(arr[j]<arr[imin]){
                    imin=j;
                }
            }
            int temp=arr[imin];
            arr[imin]=arr[i];
            arr[i]=temp;
        }
        for(int val: arr){
            System.out.println(val);
        }
    }
}
