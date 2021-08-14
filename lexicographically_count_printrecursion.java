package com.Coding_Blocks;

public class lexicographically_count_printrecursion {
    public static void main(String[] args) {
        lexo(0,1000);
    }
    public static void lexo(int curr, int fin){
        if(curr>fin){
            return;
        }

        int i = 0;
        if(curr==0){
            i=1;
        }
        System.out.println(curr);
        for(;i<=9;i++){
            lexo(curr*10+i,fin);
        }
    }

}
