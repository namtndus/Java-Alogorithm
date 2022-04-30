package com.company.programmers.level1.middleLetters;

public class MiddleLetters {
    public String solution(String s){

        if(s.length() %2 ==1) {
            return s.substring(s.length() /2,s.length() /2+1);
        }else{
            return s.substring(s.length() /2-1,s.length() /2+1);
        }
    }

    public static void main(String[] args) {
        MiddleLetters letters = new MiddleLetters();
        System.out.println(letters.solution("qwer"));
    }
}
