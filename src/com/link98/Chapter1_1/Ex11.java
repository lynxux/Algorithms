package com.link98.Chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class Ex11 {
    public static void main(String[] args) {
        boolean[][] b = {{true,false,true},{false,true,true}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                StdOut.print("["+i+","+j+"]:");
                if(b[i][j] == true) StdOut.print("* ");
                else StdOut.print("  ");
            }
            StdOut.println();
        }
    }
}
