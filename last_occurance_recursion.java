package com.Coding_Blocks;

import java.util.Scanner;

public class last_occurance_recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter size of array:");
        int size= in.nextInt();
        System.out.print("enter element to check:");
        int ele = in.nextInt();
        System.out.print("enter array elements");
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("last occurance of "+ele+" is "+lo(arr,ele,arr.length-1));
    }
    public static int lo(int[] arr, int item , int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==item){
            return index;
        }
        else{
            return lo(arr,item,index-1);
        }
    }
}
