package com.link98.Chapter1_1;

public class Ex09 {

    public static void main(String[] args) {
        System.out.println(toBinaryString(196));
    }

    public static String toBinaryString(int N) {
    if (N == 0) {
        return "0";
    }
    String s = "";
    while (N > 0) {
        s = N % 2 + s;
        N /= 2;
    }
    return s;
    }

}
