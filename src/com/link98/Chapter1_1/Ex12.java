package com.link98.Chapter1_1;

public class Ex12 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9-i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++) {
            System.out.println(a[i]); //原题是System.out.println(i); 我觉的可能是个失误
        }
    }
}
