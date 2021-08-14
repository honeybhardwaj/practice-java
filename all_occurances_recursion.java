package com.Coding_Blocks;

import java.util.ArrayList;
import java.util.Scanner;

public class all_occurances_recursion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter size of array:");
        int size = in.nextInt();
        System.out.println("enter elements of array:");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=in.nextInt();
        }
        System.out.println("enter the element for which you want to add occurances:");
        int ele= in.nextInt();
        int[] occur= all(arr,0,0,ele);
        System.out.println("all occurances are:");
        for(int i : occur){
            System.out.print(i+" ");
        }
    }
    public static int[] all(int[] arr,int index, int count , int item){
        if(index==arr.length){
            int[] ans = new int[count];
            return ans;
        }
        if(arr[index]==item){
            int[] ans = all(arr,index+1,count+1,item);
            ans[count]=index;
            return ans;
        }
        else{
            return all(arr,index+1,count,item);
        }
    }
}
