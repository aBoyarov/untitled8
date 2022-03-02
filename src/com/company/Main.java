package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < args.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }

        int[] arr1 = new int[100];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = i + 1;
        }

        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) arr2[i] *= 2;
        }

        int[][] arr3 = new int[10][10];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                if (i == j) {
                    arr3[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = arr3.length - 1; j >= 0; j--) {
                if (i == j) {
                    arr3[i][j] = 1;
                }
            }
        }

    }
    public static int[] method(int len, int initialValue){
        int [] x = new int [len];
        for (int i = 0; i < x.length; i++) {
            x[i] = initialValue;
        }
        return x;
    }
}
