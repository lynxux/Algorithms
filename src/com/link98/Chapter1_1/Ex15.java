package com.link98.Chapter1_1;

public class Ex15 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 2, 3, 1, 7, 5, 3, 5, 2, 6 };
        int[] result = histogram(a, 8);  //M为最大值+1
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%3d", result[i]);
        }
    }

    public static int[] histogram(int[] a,int M){
        int[] solu = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] >= 0 && a[i] < M) {
                solu[a[i]]++; //保证a[]中的元素都在0到M之间的情况下，可以使用这种方法
            }
        }
        return solu;
    }
}
