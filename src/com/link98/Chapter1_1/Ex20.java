package com.link98.Chapter1_1;

public class Ex20 {
    public static void main(String[] args) {
        System.out.println(ff(3));
    }

    public static double ff(int N){
        if(N == 1) return 0;
        return Math.log(N)+ff(N-1);
    }

}
