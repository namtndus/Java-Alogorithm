package com.company.programmers.level2.primeNumber;

import java.util.Arrays;

public class PrimeNumber {
    public int solution(int[] arr){

        int num = GCD(Math.max(arr[0],arr[1]), Math.min(arr[0],arr[1]));
        num = arr[0] * arr[1] /num;

        for(int i = 2; i<arr.length; i++){
            int tmp = GCD(Math.max(num,arr[i]), Math.min(num,arr[i]));
            num = num* arr[i] /tmp;
        }


        return num;
    }

    private int GCD(int max, int min) {
        int tmp = 0;

        if(max % min == 0){
            return min;
        }else{
            min = GCD(min, max%min);
        }
        return min;
    }

    public static void main(String[] args) {
        PrimeNumber number = new PrimeNumber();
        int[] arr = new int[]{1,2,3};
        System.out.println(number.solution(arr));
    }
}
