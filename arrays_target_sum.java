package com.Coding_Blocks;

import java.util.Arrays;
import java.util.Scanner;

public class arrays_target_sum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int target = in.nextInt();
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(target-arr[i]-arr[j]>0 && arr[j]<target-arr[i]-arr[j]){
                    if(Search((target-arr[i]-arr[j]),arr)){
                        System.out.println(arr[i]+", "+arr[j]+" and  "+(target-arr[i]-arr[j]));
                    }
                }
            }
        }
    }

    public static Boolean Search(int m, int[] arr){
        int lo=0;
        int hi=arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==m){
                return true;
            }
            else if(arr[mid]<m){
                lo=mid+1;
            }
            else{
                hi=mid-1;
            }
        }
        return false;
    }
}
