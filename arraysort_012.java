package com.company;

import java.util.Scanner;

public class arraysort_012 {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int [] arr = new int[n];
        for(int i =0;i<n;i++){
            arr[i]=in.nextInt();
        }
        for(int val:sort(arr)){
            System.out.print(val+" ");
        }

    }
    public static int[] sort(int[] arr){
        int lo=0;
        int mid=0;
        int hi=arr.length-1;
        int temp;
        while(mid<=hi){
            if(arr[mid]==0){
                temp=arr[lo];
                arr[lo]=arr[mid];
                arr[mid]=temp;

                mid++;
                lo++;
            }
            else if(arr[mid]==2){
                temp=arr[hi];
                arr[hi]=arr[mid];
                arr[mid]=temp;
                hi--;
            }
            else{
                mid++;
            }
        }
        return arr;
    }
}
