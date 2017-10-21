package com.link98.Chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class Ex05 {
    public static void main(String[] args) {
        double x = StdIn.readDouble(); //书本提供的外部jar
        double y = StdIn.readDouble();
        System.out.println(x > 0 && x < 1 && y > 0 && y < 1);
    }
}
