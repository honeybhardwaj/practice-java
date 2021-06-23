package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class rain_water_harvesting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }

        int []left=new int[n];
        for(int i =1;i<n;i++){
            left[i]=Math.max(left[i-1],arr[i-1]);
        }

        int []right=new int[n];
        for(int i =n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i+1]);
        }
        int level = 0;
        for(int i=0;i<n;i++){
            if(Math.min(left[i],right[i])-arr[i]>=0){
            level+=Math.min(left[i],right[i])-arr[i];
            }
        }
        System.out.println(level);

    }
}
