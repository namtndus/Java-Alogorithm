package com.company.class2.num15829;

import java.util.Scanner;

public class Hashing {
    public static void main(String[] args){
        final int n = 31;
        final int mod = 1234567891;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String str = sc.next();
        long pow = 1;
        long answer = 0;

        for(int i = 0; i < size; i++){
            answer += (str.charAt(i) - 'a' + 1 ) * pow;
            pow = (pow *= n) %mod;
        }
        System.out.println(answer %mod);
    }
}
