package com.Coding_Blocks;

import java.util.Scanner;

public class class_assignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int c=1;
        while(T>0){
            int n=in.nextInt();
            System.out.println("#"+c+" : "+recur(n,""));
            c++;
            T--;
        }
    }
    public static int recur(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return 1;
        }
        int sp1=recur(n-1,ans+"a");
        int sp2=0;
        if(ans.isEmpty() || ans.charAt(ans.length()-1)!='b'){
            sp2=recur(n-1,ans+"b");
        }
        return sp1+sp2;
    }
}
