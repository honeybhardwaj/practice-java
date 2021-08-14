package com.Coding_Blocks;

public class palindrome_partitioning {
    public static void main(String[] args) {
        partition("nitin","");
    }
    public static void partition(String str , String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        for(int i = 1;i<=str.length();i++){
            String part1= str.substring(0,i);
            if(ispalin(part1)){
                partition(str.substring(i),ans+"-"+part1);
            }
        }
    }
    public static boolean ispalin(String str){
        int low=0;
        int high = str.length()-1;
        while(low<high){
        if(str.charAt(low)==str.charAt(high)){
            low++;
            high--;
        }
        else{
            return false;
        }
        }
        return true;
    }
}
