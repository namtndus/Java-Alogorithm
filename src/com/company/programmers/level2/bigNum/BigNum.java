package com.company.programmers.level2.bigNum;

import java.util.Arrays;
import java.util.Comparator;

public class BigNum {

    public String solution(int[] numbers){
        String answer = "";
        String[] strNumber = new String[numbers.length];

        for(int i = 0; i< strNumber.length; i++){
            strNumber[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNumber, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return (s2+s1).compareTo(s1+s2);  // 내림차순 정렬
            }
        });

        for(String tmp :strNumber){
            answer += tmp;
        }
        if(answer.startsWith("0")) answer = "0";

        return answer;
    }

    public static void main(String[] args) {
        BigNum bigNum = new BigNum();
        int[] arg = {6,10,2};
        System.out.println(bigNum.solution(arg));
    }

}
