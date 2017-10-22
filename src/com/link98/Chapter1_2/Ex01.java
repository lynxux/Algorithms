package com.link98.Chapter1_2;

public class Ex01 {
    public static void main(String[] args) {

        String a = "aaa";
        String b ="aaa";
        int n=a.length(),m = b.length();
        if (a==b) System.out.println(-1);
        else System.out.println(n>m ? n : m);
    }
}
