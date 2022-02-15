package com.company.class1.num10952;

import java.util.Scanner;

public class Add {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = 1;
        int num2 = 1;
        do{
            num1 = sc.nextInt();
            num2 = sc.nextInt();
            System.out.println(num1+num2);
        }while(!(num1 == 0) && !(num2 == 0));
    }
}
