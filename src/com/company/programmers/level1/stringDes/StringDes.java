package com.company.programmers.level1.stringDes;

import java.util.Arrays;
import java.util.Collections;

public class StringDes {
    public String solution(String s){

        String[] str = s.split("");

        Arrays.sort(str, Collections.reverseOrder());

        return String.join("",str);
    }

    public static void main(String[] args) {
        StringDes stringDes = new StringDes();
        System.out.println(stringDes.solution("Zbcdefg"));
    }
}
