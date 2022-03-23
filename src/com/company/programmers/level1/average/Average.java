package com.company.programmers.level1.average;

public class Average {

    static int arr[] = {1,2,3,4};

    public static void main(String[] args) {
        double answer = 0;

        for(int i = 0; i<arr.length; i++){
            answer += arr[i];
        }

        answer = answer / arr.length;

        System.out.println(answer);
    }

}
