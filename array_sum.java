package com.Coding_Blocks;

import java.util.ArrayList;
import java.util.Scanner;

public class array_sum {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr1= new int[n];
        for(int i = 0;i<n;i++){
            arr1[i]=in.nextInt();
        }
        int m=in.nextInt();
        int [] arr2=new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=in.nextInt();
        }

        ArrayList<Integer> arr3=solve(arr1,arr2,m,n);
        for(int val : arr3){
            System.out.print(val+", ");
        }
        System.out.print("END");

    }
    public static ArrayList<Integer> solve(int[] arr1,int[] arr2, int m, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = n-1;
        int p2 = m-1;
        int carry =0;
        while(p1 >=0 || p2>=0) {
//			int sum = arr1[p1]+arr2[p2]+carry;
            int sum = carry;
            if(p1>=0) {
                sum=sum+arr1[p1];
            }
            if(p2>=0) {
                sum=sum+arr2[p2];
            }
            int digit  =sum%10;
            carry = sum/10;
            ans.add(0,digit);
            p1--;
            p2--;
        }
        if(carry>0) {
            ans.add(0,carry);
        }
        return ans;
    }
}
