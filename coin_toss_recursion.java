package com.Coding_Blocks;

import java.util.ArrayList;

public class coin_toss_recursion {
    public static void main(String[] args) {
        System.out.println(cointoss(5));
    }
    public static ArrayList<String> cointoss(int n){
        if(n == 0){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> sp= cointoss(n-1);
        ArrayList<String> bp = new ArrayList<>();
        for(String ele : sp){
            bp.add(ele+"H");
            bp.add(ele+"T");
        }
        return bp;
    }
}
