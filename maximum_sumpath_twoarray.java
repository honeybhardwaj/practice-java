package com.Coding_Blocks;

import java.util.Scanner;

public class maximum_sumpath_twoarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            int m = in.nextInt();
            int n = in.nextInt();
            int [] arr1 = new int[m];
            int [] arr2 = new int[n];
            for(int i=0;i<m;i++){
                arr1[i]=in.nextInt();
            }
            for(int i=0;i<n;i++){
                arr2[i]=in.nextInt();
            }
            int sum1=0 , sum2=0, result=0;
            int i=0,j=0;
            while(i<n && j<n){
                if(arr1[i]>arr2[j]){
                    sum2+=arr2[j];
                    j++;
                }
                else if(arr1[i]==arr2[j]){
                    result+=Math.max(sum1,sum2);
                    sum1=0;
                    sum2=0;

                    int temp = i;
                    while (i < m && arr1[i] == arr2[j])
                        sum1 += arr1[i++];

                    while (j < n && arr1[temp] == arr2[j])
                        sum2 += arr2[j++];

                    result += Math.max(sum1, sum2);

                    sum1 = 0;
                    sum2 = 0;
                }
                else{
                    sum1+=arr1[i];
                    i++;
                }
            }
            while(i<m){
                sum1+=arr1[i];
                i++;
            }
            while(j<n){
                sum2+=arr2[j];
                j++;
            }
            result+=Math.max(sum1,sum2);
            System.out.println(result);
            t--;
        }
    }
}
