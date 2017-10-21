package com.link98.Chapter1_1;

public class Ex13 {
    public static void main(String[] args) {
        int[][] arr = {{2,3,5},{6,7,9}};
        exchange(arr);
    }

    public static void exchange(int[][] arr){
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%4d", arr[j][i]);
            }
            System.out.println();
        }
    }
}
