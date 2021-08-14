package com.Coding_Blocks;

public class subsequence_printrecursion {
    public static void main(String[] args) {
        subseq("abc","");
    }
    public static void subseq(String str , String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        subseq(str.substring(1),ans+str.charAt(0));
        subseq(str.substring(1),ans);
    }
}
