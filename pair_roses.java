package com.company;

import java.util.Scanner;

public class pair_roses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int n = in.nextInt();
            int [] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            int m = in.nextInt();
            int diff = m;
            int p1 = 0,p2=0;
            for(int i=0;i<n-1;i++){
                for(int j=i+1;j<n;j++){
                    if(m-(arr[i]+arr[j])==0 && Math.abs(arr[i]-arr[j])<=diff){
                        diff= Math.abs(arr[i]-arr[j]);
                        p1=arr[i];
                        p2=arr[j];
                    }
                }
            }

            System.out.print("Deepak should buy roses whose prices are ");
            System.out.print(p1);
            System.out.print(" and ");
            System.out.print(p2);
            System.out.print(".");
            t--;
        }


    }


}
