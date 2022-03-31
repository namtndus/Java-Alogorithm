package com.company.programmers.level1.twoNumSum;

public class TwoNumSum {

    public long solution(int a, int b){
        long answer = 0;
        if(a == b){
            return a;
        }else if(a > b){

            for(int i = b; i <=a; i++){
                answer+=i;
            }

        }else{
            for(int i = a; i <=b; i++){
                answer+=i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        TwoNumSum sum = new TwoNumSum();

        System.out.println(sum.solution(5,3));
    }

}
