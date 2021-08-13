package com.Coding_Blocks;

import java.util.Scanner;

public class first_occurance_recursion {
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
        System.out.println("first occurance of "+ele+" is "+fo(arr,ele,0));
    }

    public static int fo(int [] arr, int item , int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==item){
            return index;
        }
        else{
            return fo(arr,item,index+1);
        }
    }
}
