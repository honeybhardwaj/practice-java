package com.Coding_Blocks;

public class cointoss_printrecursion {
    public static void main(String[] args) {
        cointoss(3,"");
    }
    public static void cointoss(int n, String ans){
        if(n==0){
            System.out.println(ans);
            return;
        }
        cointoss(n-1,ans+"H");
        cointoss(n-1,ans+"T");
    }
}
