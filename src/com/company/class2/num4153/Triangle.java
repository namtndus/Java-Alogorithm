package com.company.class2.num4153;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        // 직각삼각형 공식 => a^2 + b^2 == c^2
        // 숫자를 3개를 받아 그중에 0이 하나라도 있다면 결과 종류
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        while (a != 0 || b != 0 || c !=0) {
            int max = 0; // 가장 큰 수를 저장
            int total = 0; // 두 제곱수를 더한 값을 저장하는 변수
            if (a < b) {
                max = b;
                total += a*a;
                if (c < max) {
                    total += c*c;
                } else {
                    max = c;
                    total += b*b;
                }
            } else {
                max = a;
                total += b*b;
                if (c < max) {
                    total += c*c;
                } else {
                    max = c;
                    total += a*a;
                }
            }
            if(max * max == total){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        }
    }
}
