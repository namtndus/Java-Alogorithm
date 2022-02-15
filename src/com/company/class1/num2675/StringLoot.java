package com.company.class1.num2675;

import java.util.Scanner;

public class StringLoot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        for(int i = 0; i<size; i++){
            int num = sc.nextInt();
            String letter = sc.next();
            char[] letters = letter.toCharArray();
            String word ="";
            for(int j = 0; j<letters.length; j++) {
                for(int z = 0; z<num; z++){
                    word += letters[j];
                }
            }
            System.out.println(word);
        }
    }
}
