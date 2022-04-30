package com.company.programmers.level2.fibonacciNum;

import java.util.ArrayList;

public class FibonacciNum {
    public int solution(int n){
        ArrayList<Integer> fibonNum = new ArrayList<>();
        fibonNum.add(0);
        fibonNum.add(1);

        for(int i = 0; i <= n; i++){
            if(i == 0 ) fibonNum.get(0);
            else if(i == 1) fibonNum.get(1);
            else {
                int num = fibonNum.get(i-1) + fibonNum.get(i-2);
                fibonNum.add(num % 1234567);
            }
        }

        return fibonNum.get(n);
    }

    public static void main(String[] args) {
        FibonacciNum num = new FibonacciNum();
        System.out.println(num.solution(2));
    }
}
