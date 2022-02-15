package com.company.class1.num2884;

import java.util.Scanner;

public class Clock {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int minus = 45;
        int hour = sc.nextInt();
        int min = sc.nextInt();
        if(min - minus<0){
            hour -=1;
            min = 60 + min -minus;
            if(hour<0){
                hour = 23;
            }
        }else{
            min = min - minus;
        }
        System.out.println(hour+" "+min);
    }
}
