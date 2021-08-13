package com.Coding_Blocks;

import java.util.ArrayList;

public class maze_prb_recursion3 {
    public static void main(String[] args) {
        System.out.println(maze(0,0,2,2));
    }
    public static ArrayList<String> maze(int x, int y , int xd , int yd){
        if(x==xd && y==yd){
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        if(x>xd || y>yd){
            return new ArrayList<String>();
        }

        ArrayList<String> sp1 = maze(x+1, y, xd, yd);
        ArrayList<String> sp2 = maze(x, y+1, xd, yd);
        ArrayList<String> bp = new ArrayList<>();
        for(String path : sp1){
            bp.add("R"+path);
        }
        for(String path : sp2){
            bp.add("D"+path);
        }
        return bp;
    }
}
