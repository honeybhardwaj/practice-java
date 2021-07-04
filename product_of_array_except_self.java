package com.Coding_Blocks;

import java.util.Scanner;

public class product_of_array_except_self {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int []left = new int[n];
        int []right= new int[n];
        left[0]=1;
        for (int i=1;i<n;i++){
            left[i]=left[i-1]*arr[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1]*arr[i+1];
        }
        for(int i=0;i<n;i++){
            arr[i]=right[i]*left[i];
        }
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
