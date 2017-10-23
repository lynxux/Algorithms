package com.link98.Chapter1_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex28 {
    public static void main(String[] args) {
        int[] whitelist = {1,1,4,3,7,5,5,8,3,7};
        Arrays.sort(whitelist);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < whitelist.length - 1; i++) {
            if (whitelist[i] != whitelist[i + 1]) {
                list.add(whitelist[i]);
            }
        }
        System.out.println(list);
    }
}
