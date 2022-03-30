package com.company.programmers.level1.findKimFromSeoul;

import java.util.Collections;

public class FindKimFromSeoul {
    public String solution(String[] seoul){
        for(int i = 0; i<seoul.length; i++){
            String name = seoul[i].toUpperCase();
            if(name.equals("KIM")){
                return "김서방은 "+i+"에 있다";
            }
        }
        return "김서방은 없다";
    }

    public static void main(String[] args) {
        FindKimFromSeoul kim = new FindKimFromSeoul();
        String[] seoul = {"Jane","Kim"};

        System.out.println(kim.solution(seoul));
    }
}
