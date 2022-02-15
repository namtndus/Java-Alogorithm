package com.company.class1.num8958;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<String> quize = new ArrayList<>();
        ArrayList<Integer> scores = new ArrayList<Integer>();
        for(int i = 0; i<size; i++){
            quize.add(sc.next());
        }

        for(String word : quize) {
            char[] digits = word.toCharArray();
            int total = 0;
            int score = 0;
            for (int i = 0; i < digits.length; i++) {
                // 총합

                if (digits[i] == 'O') {
                    score += 1;
                    total += score;
                } else {
                    score = 0;
                }
                if (i == digits.length - 1) {
                    scores.add(total);
                }

            }
        }
        for(int num : scores){
            System.out.println(num);
        }
    }
}
