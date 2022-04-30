package com.company.programmers.level2.targetNum;

import java.util.Arrays;

public class TargetNum {

    public int solution(int[] numbers, int target){
        boolean[] isChecked = new boolean[numbers.length];
        Arrays.fill(isChecked,false);
        int answer = 0;
        answer = dfs(numbers,isChecked,0,target);
        return answer;
    }

    private int dfs(int[] numbers, boolean[] isChecked, int i, int target) {
        int size = 0;

        if(i == isChecked.length){
            size += Check(numbers,isChecked,target);
            return size;
        }

        size += dfs(numbers,isChecked,i+1,target);
        isChecked[i] = true;
        size += dfs(numbers, isChecked, i+1, target);
        isChecked[i] = false;
        return size;
    }

    private int Check(int[] numbers, boolean[] isChecked, int target) {
        int sum = 0;
        for(int i = 0; i< isChecked.length; i++){
            if (isChecked[i]){
                sum += numbers[i];
            }else{
                sum -= numbers[i];
            }
        }
        if(sum == target){
            return 1;
        }

        return 0;
    }

    public static void main(String[] args) {
        TargetNum num = new TargetNum();
        int[] numbers = {4,1,2,1};
        System.out.println(num.solution(numbers,4));
    }

}
