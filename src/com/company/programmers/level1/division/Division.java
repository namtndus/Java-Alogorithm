package com.company.programmers.level1.division;

public class Division {

    public int solution(int n){
        int answer = 0;

        for(int i = 1; i<n; i++){
            if(n%i == 1){
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Division division = new Division();
        System.out.println(division.solution(12));
    }

}
