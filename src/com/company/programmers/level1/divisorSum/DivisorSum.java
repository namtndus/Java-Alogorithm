package com.company.programmers.level1.divisorSum;

public class DivisorSum {

    public int solution(int n){
        int answer = 0;
        for(int i = 1; i <= Math.sqrt(n); i++ ){
            int divisor = n/i;
            if(n%i == 0 && n/i == i){
                answer+= i;
            }else if(n%i == 0){
                answer+= i+divisor;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        DivisorSum sum = new DivisorSum();
        System.out.println(sum.solution(12));
    }

}
