package com.Coding_Blocks;

import java.util.ArrayList;

public class climbing_stairs_recursion {
    public static void main(String[] args) {
        System.out.println(climb(0,5));
    }
    public static ArrayList<String> climb(int curr, int dest){
        if(curr == dest){
            ArrayList<String> Ans = new ArrayList<>();
            Ans.add("");
            return Ans;
        }

        if(curr>dest){
            return new ArrayList<String>();
        }
        ArrayList<String> sp1 = climb(curr+1,dest);
        ArrayList<String> sp2 = climb(curr+2,dest);
        ArrayList<String> sp3 = climb(curr+3,dest);
        ArrayList<String> bp = new ArrayList<>();

        for(String path : sp1){
            bp.add("1"+path);
        }
        for(String path : sp2){
            bp.add("2"+path);
        }
        for(String path : sp3){
            bp.add("3"+path);
        }
        return bp;

    }
}
