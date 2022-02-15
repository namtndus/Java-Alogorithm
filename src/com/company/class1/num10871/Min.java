package com.company.class1.num10871;

import java.util.ArrayList;
import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> minNums = new ArrayList<Integer>();
        int size = sc.nextInt();
        int num = sc.nextInt();
        for(int i = 0; i<size; i++){
            int input = sc.nextInt();
            if(num > input){
                minNums.add(input);
            }
        }
        for(int i : minNums){
            System.out.print(i+" ");
        }
    }
}
