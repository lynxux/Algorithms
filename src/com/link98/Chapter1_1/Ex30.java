package com.link98.Chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class Ex30 {

    public static void main(String[] args) {
        int N = StdIn.readInt();
        boolean[][] a = new boolean[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(gcd(i,j)==1)  a[i][j] = true;
                else a[i][j] = false;
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static int gcd(int a,int b){
        int temp;
        while(b!=0)
        {
        /*利用辗除法，直到b为0为止*/
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
