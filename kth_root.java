package com.Coding_Blocks;

import java.util.Scanner;

public class kth_root {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t>0){
            long n= in.nextLong();
            int k= in.nextInt();
            long lo=0;
            long hi=n;
            while(lo<=hi) {
                long mid = (lo+hi)/2;
                if((long) (Math.pow(mid,k))==n) {
//					System.out.println(mid);
					hi=mid;
                    break;
                }
                else if((long) (Math.pow(mid,k))<n) {
                    lo = mid+1;
                }
                else {
                    hi = mid-1;
                }
            }
            System.out.println(hi);
            t--;
        }
    }
}

