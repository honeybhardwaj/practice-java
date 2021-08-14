package com.Coding_Blocks;

import java.util.Scanner;

public class convert_string_to_integer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inp = in.next();
        int ans = convert(inp);
        System.out.println(ans);
    }
    public static int convert(String str){
        if(str.length()==1){
            return str.charAt(0)-'0';
        }
        int sp = convert(str.substring(1));
        String x =  ""+str.charAt(0);
        int val= Integer.parseInt(x) * (int) Math.pow(10, str.length() - 1);
        int ans = val+sp;
        return ans;
    }
}
