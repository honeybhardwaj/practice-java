package com.Coding_Blocks;

import java.util.Scanner;

public class sort_0and1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i]=in.nextInt();
        }
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            if(arr[low]==1){
                int temp = arr[low];
                arr[low]=arr[high];
                arr[high]=temp;

                high--;
            }
            else{
                low++;
            }

        }
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
