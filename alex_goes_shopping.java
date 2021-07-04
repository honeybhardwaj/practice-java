package com.Coding_Blocks;

import java.util.Scanner;

public class alex_goes_shopping {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int q = in.nextInt();
        while(q>0){
            int a = in.nextInt();
            int k = in.nextInt();
            int count = 0;
            for(int i=0;i<n;i++){
                if(a%arr[i]==0){
                    count++;
                }
                System.out.println(count);
            }
            if(count>=k){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            q--;
        }

    }
}
