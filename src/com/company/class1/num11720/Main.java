package com.company.class1.num11720;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String b = sc.next();
        // 문자열을 char형의 배열로 바꾸어주는 함수
        char[] word = b.toCharArray();
        int sum = 0;


        System.out.println(b);
        System.out.println(a);
        for(int i = 0; i<a; i++){
            sum += Character.getNumericValue(word[i]);
        }
        System.out.println(sum);
    }
}
