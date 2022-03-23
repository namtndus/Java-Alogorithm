package com.company.programmers.level1.sumOfNums;

public class SumOfNums {
    public static void main(String[] args) {
        //  약수의 갯수를 구해야 함
        int left = 24;
        int right = 27;
        int sum = 0;

        for(int i = left; i<=right; i++){
            int count = 0;
            for(int j = 1; j<= i; j++){
                if(i % j == 0){
                    count++;
                }
            }
            if(count % 2 == 0){
                sum += i;
            }else{
                sum -=i;
            }
        }

        System.out.println(sum);
    }
}
