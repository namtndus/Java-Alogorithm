package com.company.programmers.level1.findprimenumber;

import java.util.Arrays;

public class FindPrimeNumber {
    public int solution(int n){
        boolean[] arr = new boolean[n+1];
        Arrays.fill(arr,true);
        arr[0] = false;
        arr[1] = false;
        int answer = 0;

        for(int i = 2; i<arr.length; i++){
            for(int j = i; j<arr.length; j+=i){
                if(j != i){
                    arr[j] = false;
                }
            }
        }
        for(int i = 2; i<arr.length; i++){
            if(arr[i] == true){
                answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        FindPrimeNumber primeNumber = new FindPrimeNumber();
        System.out.println(primeNumber.solution(10));
    }
}
