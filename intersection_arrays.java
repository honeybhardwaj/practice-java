package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class intersection_arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr1 = new int[n];
        int [] arr2 = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            arr2[i]=in.nextInt();
        }
        System.out.println(inter(arr1,arr2));
    }
    public static ArrayList<Integer> inter(int [] arr1 , int [] arr2){
        ArrayList<Integer> a = new ArrayList<>();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int p1=0,p2=0;
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]==arr2[p2]){
                a.add(arr1[p1]);
                p1++;
                p2++;
            }
            else if(arr1[p1]>arr2[p2]){
                p2++;
            }
            else{
                p1++;
            }
        }
        return a;
    }
}
