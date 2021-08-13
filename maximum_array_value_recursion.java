package com.Coding_Blocks;

import java.util.Scanner;

public class maximum_array_value_recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size = in.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("maximum element is "+findmax(arr,0));
    }

    public static int findmax(int[] arr, int index){
        if(index==arr.length-1){
            return arr[index];
        }
        return Math.max(arr[index], findmax(arr,index+1));
    }
}
