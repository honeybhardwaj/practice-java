package com.Coding_Blocks;

import java.util.Scanner;

public class print_array_recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i]=in.nextInt();
        }
        print(arr,0);
    }
    public static void print(int [] arr, int index){
        if(index==arr.length){
            return;
        }
        System.out.println(arr[index]);
        print(arr,index+1);
    }
}
