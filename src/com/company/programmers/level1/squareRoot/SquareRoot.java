package com.company.programmers.level1.squareRoot;

public class SquareRoot {

    static long n = 121;

    public static void main(String[] args) {
        double result = Math.sqrt(n);
        long answer = (long) result;

        if(answer < result){
            System.out.println(-1);
        }else{
            System.out.println((answer + 1) * (answer + 1));
        }

        System.out.println("result: "+result);
        System.out.println("answer: "+answer);
    }

}
