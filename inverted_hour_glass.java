package com.Coding_Blocks;

import java.util.Scanner;

public class inverted_hour_glass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int RR = in.nextInt();
        int row = 1;
        int nsp = 2 * RR - 1;
        int nst = 1;
        while (row <= 2 * RR + 1) {
            if (row < RR + 1) {
                int num = RR;
                int cst = 1;
                while (cst <= nst) {
                    System.out.print(num);
                    cst++;
                    num--;
                }

                int csp = 1;
                while (csp <= nsp) {
                    System.out.print(" ");
                    csp++;
                }
                num++;
                int val = 1;
                while (num <= RR) {
                    if (num == 0) {
                        System.out.print("");
                    } else {
                        System.out.print(num);
                    }
                    num++;
                }
                System.out.println();
                nsp -= 2;
                nst++;
                row++;
            }
            else{
                int num = RR;
                int cst = 1;
                while (cst <= nst) {
                    System.out.print(num);
                    cst++;
                    num--;
                }

                int csp = 1;
                while (csp <= nsp) {
                    System.out.print(" ");
                    csp++;
                }
                num++;
                int val = 1;
                while (num <= RR) {
                    if (num == 0) {
                        System.out.print("");
                    } else {
                        System.out.print(num);
                    }
                    num++;
                }
                System.out.println();
                nsp += 2;
                nst--;
                row++;
            }
        }
    }
}