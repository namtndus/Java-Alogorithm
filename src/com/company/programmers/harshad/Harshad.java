package com.company.programmers.harshad;

public class Harshad {
    static int x = 10;

    public static void main(String[] args) {
        boolean answer = true;
        int sum = 0;

        String num = String.valueOf(x);
        for(int i = 0; i<num.length(); i++){
            sum += Integer.parseInt(num.substring(i,i+1));
        }

        if(x % sum != 0){
            answer = false;
        }

        System.out.println(answer);
    }
}
