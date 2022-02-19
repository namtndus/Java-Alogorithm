package com.company.class2.num1085;

import java.util.ArrayList;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> points = new ArrayList<>();
        points.add(sc.nextInt()) ; // 먼저 x의 좌표를 받아 온다
        points.add(sc.nextInt()); // 먼저 y의 좌표를 받아 온다.
        points.add(Math.abs(points.get(0)- sc.nextInt()));
        points.add(Math.abs(points.get(1)- sc.nextInt()));
        int min = points.get(0);

        for(int i : points){
            if(min>i){
                min = i;
            }
        }

        System.out.println(min);

    }
}
