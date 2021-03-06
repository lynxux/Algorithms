package com.link98.Chapter1_1;

public class Ex27 {
    private static long COUNT = 0;
    private static long COUNT2 = 0;
    private static double[][] MATRIX;

    public static double binomial(int N, int k, double p) {
        COUNT++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        return (1.0 - p) * binomial(N - 1, k, p) + p * binomial(N - 1, k - 1, p);
    }

    private static double bin(int N, int k, double p) {
        COUNT2++;
        if (N == 0 && k == 0) {
            return 1.0;
        }
        if (N < 0 || k < 0) {
            return 0.0;
        }
        MATRIX[N][k] = (1.0 - p) * bin(N - 1, k, p) + p * bin(N - 1, k - 1, p);
        return MATRIX[N][k];
    }

    public static double betterBinomial(int N, int k, double p) {
        MATRIX = new double[N + 1][k + 1];
        return bin(N, k, p);
    }

    public static void main(String[] args) {
        System.out.println("result: " + binomial(10, 5, 0.25) + ", count: " + COUNT);
        System.out.println("result: " + betterBinomial(10, 5, 0.25) + ", count: " + COUNT2);
    }
}
