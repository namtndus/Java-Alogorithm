package com.company.programmers.level1.descendingInteger;

import java.util.Arrays;
import java.util.Collections;

public class DescendingInteger {

    public long solution(long n){
        String str = String.valueOf(n);
        String[] arr = new String[str.length()];

        for(int i = 0; i<arr.length; i++){
            arr[i] = str.substring(i,i+1);
        }

        Arrays.sort(arr, Collections.reverseOrder());

        str = String.join("", arr);
        long answer = Long.parseLong(str);


        return answer;
    }

    public static void main(String[] args) {
        DescendingInteger integer = new DescendingInteger();
        long num = 118472L;

        System.out.println(integer.solution(num));
    }
}
