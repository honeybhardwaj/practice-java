package com.Coding_Blocks;

import java.util.ArrayList;

public class different_ways_parenthesis {
    public static void main(String[] args) {
        System.out.println(parenthesis("2*3-4*5"));
    }
    public static ArrayList<Integer> parenthesis(String str){
        ArrayList<Integer> ans = new ArrayList<>();
        if(str.indexOf('+')==-1 && str.indexOf('-')==-1 && str.indexOf('*')==-1 ){
            ans.add(Integer.parseInt(str));
            return ans;
        }

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'){
                ArrayList<Integer> sp1 = parenthesis(str.substring(0,i));
                ArrayList<Integer> sp2 =parenthesis(str.substring(i+1));
                for(int val1 : sp1) {
                    for(int val2:sp2) {
                        if(ch=='-') {
                            ans.add(val1-val2);
                        }
                        if(ch=='*') {
                            ans.add(val1*val2);
                        }
                        if(ch=='+') {
                            ans.add(val1+val2);
                        }
                    }
                }
            }
        }
    return ans;
    }
}
