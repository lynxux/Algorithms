package com.link98.Chapter1_1;

public class Ex26 {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int c=1;
        int t=0;
        if(a>b)
        {
            t = a;
            a = b;
            b = t;
        }
        if(a>c)
        {
            t = a;
            a = c;
            c = t;
        }
        if(b>c)
        {
            t = b;
            b = c;
            c = t;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
