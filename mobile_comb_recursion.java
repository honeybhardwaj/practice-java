package com.Coding_Blocks;

import java.util.ArrayList;
import java.util.List;

public class mobile_comb_recursion {
    public static void main(String[] args) {
        System.out.println(Mobile_comb("27"));

    }
    public static List<String> Mobile_comb(String str) { // 232
        if (str.isEmpty()) {
            List<String> bp = new ArrayList<>();
//			bp.add("");
            return bp;
        }
        List<String> sp = Mobile_comb(str.substring(1));// 32
        if (sp.isEmpty()) {
            sp.add("");
        }
        List<String> bp = new ArrayList<>();
        String mapped = Mapping_func(str.charAt(0));
        for (int i = 0; i < mapped.length(); i++) {
            for (String small_comb : sp) {
                bp.add(mapped.charAt(i) + small_comb);
            }
        }
        return bp;
    }

    public static String Mapping_func(char ch) {
        if (ch == '2') {
            return "abc";
        } else if (ch == '3') {
            return "def";
        } else if (ch == '4') {
            return "ghi";
        } else if (ch == '5') {
            return "jkl";
        } else if (ch == '6') {
            return "mno";
        } else if (ch == '7') {
            return "pqrs";
        } else if (ch == '8') {
            return "tuv";
        } else {
            return "wxyz";
        }
    }
}
