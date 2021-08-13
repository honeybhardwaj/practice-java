package com.Coding_Blocks;

import java.util.ArrayList;

public class subsequences_recursion {
    public static void main(String[] args) {
        System.out.println(subsequence("abc"));
    }
    public static ArrayList<String> subsequence(String str){
        if(str.isEmpty()){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        ArrayList<String> sp = subsequence(str.substring(1));
        //System.out.println(str);
        ArrayList<String> ans = new ArrayList<>();
        char ch = str.charAt(0);
        for(String ele : sp){
            ans.add(ele);
            ans.add(ch+ele);
        }
        System.out.println(ans);
        return ans;
    }
}
