package com.company.class2.num11050;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        System.out.println(factorial(N) /(factorial(N - K) * factorial(K)));
    }

    static int factorial(int N) {
       if(N <= 1){
           return 1;
       }
       return N * factorial(N -1);
    }
}
