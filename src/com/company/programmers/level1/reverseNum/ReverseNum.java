package com.company.programmers.level1.reverseNum;

import java.util.Arrays;
import java.util.Collections;

public class ReverseNum {

    public int[] solution(long n){

        String[] str = String.valueOf(n).split("");

        int[] answer = new int[str.length];
        for(int i = 0; i<answer.length; i++){
            answer[answer.length-i-1] = Integer.parseInt(str[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        ReverseNum numw = new ReverseNum();
        long num = 12345;
        int[] quiz = numw.solution(num);

        for(int i = 0; i < quiz.length; i++){
            System.out.println(quiz[i]);
        }
    }
}
