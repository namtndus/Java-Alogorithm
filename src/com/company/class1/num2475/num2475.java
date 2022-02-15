package com.company.class1.num2475;

import java.util.Scanner;

public class num2475 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for(int i = 0; i<5; i++){
            int num = sc.nextInt();
            total += num*num;
        }
        total = total%10;
        System.out.println(total);
    }
}
