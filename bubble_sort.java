package com.Coding_Blocks;

import java.util.Scanner;

public class bubble_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr []= new int[n];
        int i,j;
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int val: arr){
            System.out.println(val);
        }
    }
}
