package com.Coding_Blocks;

import java.util.ArrayList;
import java.util.Scanner;

public class subset_sum_easy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        while (T > 0) {
            int n = in.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            T--;
        }
    }
}