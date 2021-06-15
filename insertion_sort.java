package com.company;

import java.util.Scanner;

public class insertion_sort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int i ,j;
        int [] arr= new int[n];
        for(i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        for(i=1;i<n;i++){
            int val=arr[i];
            int index=i;
            while(index>0 && arr[index-1]>val){
                arr[index]=arr[index-1];
                index--;
            }
            arr[index]=val;
        }
        for(int val: arr){
            System.out.print(val+" ");
        }
    }
}
