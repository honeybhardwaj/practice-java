package com.company;

import java.util.Scanner;

public class chewbacca_and_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long temp=in.nextLong();
        long digit,newdigit,i=0, fnum=0;
        while (temp>0){
            digit=temp%10;
            if(digit==9 && temp <10){
                newdigit=9;
            }
            else {
                newdigit = 9 - digit;
            }
            if(newdigit<digit){
                fnum= fnum+newdigit *(long) (Math.pow(10,i));
            }
            else{
                fnum=fnum+digit*(long) (Math.pow(10,i));
            }
            temp=temp/10;
            i++;
        }
        System.out.println(fnum);
    }
}
