package com.company.programmers.level1.makingPrimeNumber;

import java.util.ArrayList;

public class MakingPrimeNumber {
    public static void main(String[] args) {
        // 경우의 수를 모두 구하기
        // 소수인지 아닌지를 모두 구경함
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> primeNum = new ArrayList<>();

        int[] nums = {1,2,7,6,4};
        for(int i = 0; i<nums.length; i++){
            for(int j = i + 1; j<nums.length; j++){
                for(int z = j +1; z<nums.length; z++){
                    list.add(nums[i] + nums[j] + nums[z]);
                }
            }
        }

        for(int i : list){
            boolean isChecked = false;
            for(int j = 2; j<=Math.sqrt(i+1); j++){
                for(int z = j*j; z<i+1; z+=j){
                    if(i % z == 0){
                        isChecked = true;
                        break;
                    }
                }
            }
            if(isChecked == false){
                primeNum.add(i);
            }
        }

        for(int i : primeNum){
            System.out.println(i);
        }
    }
}
