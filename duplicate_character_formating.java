package com.Coding_Blocks;

public class duplicate_character_formating {
    public static void main(String[] args) {
        dcf("hello",0,"");
    }
    public static void dcf(String str, int index, String ans){
        if(index==str.length()){
            System.out.println(ans);
            return;
        }
        if(index>0 && ans.charAt(ans.length()-1)==str.charAt(index)){
            dcf(str,index,ans+"*");
        }
        else{
            dcf(str,index+1,ans+str.charAt(index));
        }

    }
}
