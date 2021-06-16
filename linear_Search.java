package com.company;

import java.util.Scanner;

public class linear_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int m = in.nextInt();
        System.out.println(LinearSearch(arr,m,n));
    }
    public static int LinearSearch(int [] arr, int m,int n){
        int index=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==m){
                index=i;
                break;
            }
        }
        return index;
    }
}
