package com.company.programmers.level1.stringToInteger;

public class StringToInteger {
    public int solution(String s){
        int answer = 0;
        String signel = s.substring(0,1);
        if(signel.equals("+")){
            return Integer.parseInt(s.substring(1));
        }else if(signel.equals("-")) {

        }
        answer = Integer.parseInt(s);
        return answer;

    }

    public static void main(String[] args) {
        StringToInteger stringToInteger = new StringToInteger();
        System.out.println(stringToInteger.solution("-1234"));
        return;
    }
}
