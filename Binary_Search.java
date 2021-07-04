package com.Coding_Blocks;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        int m=in.nextInt();
        System.out.println(BinarySearch(arr,m,n));
    }
    public static int BinarySearch(int[] arr,int m,int n){
        int lo=0;
        int hi=n-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==m){
                return mid;
            }
            else if(arr[mid]<m){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return -1;
    }
}
