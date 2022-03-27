package com.company.programmers.level1.digitSum;

public class DigitSum {
    public int solution(int n){
        int answer = 0;
        String[] str = String.valueOf(n).split("");
        for(String i : str){
            answer += Integer.parseInt(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        DigitSum num = new DigitSum();
        System.out.println(num.solution(987));
    }
}
