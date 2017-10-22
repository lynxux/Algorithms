package com.link98.Chapter1_1;

public class Ex24 {
    public static void main(String[] args) {
        System.out.println(gcd(105,24));
        System.out.println(gcd(1111111,1234567));
    }

    public static int gcd(int m,int n){
        System.out.println("p = " + m + ", q = " + n);
        if(m%n==0) return n;
        else return gcd(n,m%n);
    }
}
