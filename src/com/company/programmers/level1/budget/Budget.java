package com.company.programmers.level1.budget;

import java.util.Arrays;
public class Budget {

    public int solution(int[] d, int budget){
        int maxBudget = 0;
        int max = d.length;

        for(int i = 0; i<d.length; i++){
            maxBudget += d[i];
        }
        if(maxBudget == budget){
            return max;
        }
        Arrays.sort(d);

        for(int i = d.length-1; i>=0; i--){
            maxBudget -= d[i];
            max--;
            if(maxBudget <= budget){
                break;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Budget budget = new Budget();

        int[] d = new int[]{1,1,1};

        System.out.println(budget.solution(d, 2));
    }

}
