package com.company.class2.num2869;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        int down = sc.nextInt();
        int height = sc.nextInt();

        int day = (height - down) / (speed -down);

        //나머지가 있을 경우 (잔여 블럭이 있을 경우)
        if((height - down) % (speed - down) != 0){
            day++;
        }
        System.out.println(day);
    }
}
