package com.link98.Chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex07 {
    public static void main(String[] args) {
        {
            //7.a牛顿迭代法计算平方根
            double t = 9.0;
            while (Math.abs((t - 9.0 / t)) > .001)
                t = (9.0 / t + t) / 2.0;
            StdOut.printf("%.5f\n", t);
        }
        {
            //7.b
            int sum = 0;
            for (int i = 1; i < 1000; i++) {
                for (int j = 0; j < i; j++) {
                    sum++;
                }
            }
            StdOut.println(sum);
        }
        {
            //7.c
            int sum = 0;
            for (int i = 1; i < 1000; i*=2) {
                for (int j = 0; j < 1000; j++) {
                    sum++;
                }
            }
            StdOut.println(sum);
        }
    }
}
