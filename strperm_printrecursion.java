package com.Coding_Blocks;

public class strperm_printrecursion {
    public static void main(String[] args) {
        perm("abc","");
    }
    public static void perm(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            perm(str.substring(0,i)+str.substring(1+i),ans+str.charAt(i));
        }
    }
}
