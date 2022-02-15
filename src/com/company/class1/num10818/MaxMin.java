package com.company.class1.num10818;

import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int max = 0;
        int min = 0;
        for(int i = 0; i<size; i++){
            int num = sc.nextInt();
            if(max == 0 && min == 0){
                max = num;
                min = num;
            }
            if(num>max){
                max = num;
            }else if(num<min){
                min = num;
            }
        }
        System.out.println(min + " "+max);
    }
}
