package com.company.programmers.level1.maxmin;

import java.util.ArrayList;
import java.util.Collections;

public class MaxMin {
    static final int n = 3;
    static final int m = 12;

    public static void main(String[] args) {
        int[] answer = new int[2];

        int min = (n < m) ? n :m;
        int gcd = 0;
        for(int i = 1; i<= min; i++){
            if(n % i == 0 && m % i == 0){
                gcd = i;
            }
        }

        answer[0] = gcd;
        answer[1] = (n *m) / gcd;

        System.out.println(answer);
    }

}
