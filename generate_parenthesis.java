package com.Coding_Blocks;

public class generate_parenthesis {
    public static void main(String[] args) {
        generate(0,0,3,"");
    }
    public static void generate(int open, int close, int n , String ans){
        for(int i=0;i<2*n;i++){
            if(open>n||close>n||close>open){
                return;
            }
            if(open==n && close == n){
                System.out.println(ans);
                return;
            }
            generate(open+1,close,n,ans+"(");
            generate(open,close+1,n,ans+")");
        }
    }
}
