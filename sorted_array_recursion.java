package com.Coding_Blocks;

import java.util.Scanner;

public class sorted_array_recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        System.out.println(sorted(arr, size));
    }
    public static boolean sorted(int[] arr, int size){
        if(size==1){
            return true;
        }
        if(arr[size-1]>arr[size-2]){
            return true && sorted(arr,size-1);
        }
        else{
            return false;
        }
    }
}
