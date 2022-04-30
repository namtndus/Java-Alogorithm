package com.company.programmers.level1.trainingClothes;

import java.util.ArrayList;
import java.util.Arrays;

public class TrainingClothes {
    public int solution(int n, int[] lost, int[] reserve){
        int answer = 0;
        boolean[] isChecked = new boolean[n+1];
        ArrayList<Integer> lostList = new ArrayList<>();
        ArrayList<Integer> reservList = new ArrayList<>();
        Arrays.fill(isChecked,true);
        Arrays.sort(reserve);
        isChecked[0] = false;

        for(int i : reserve){
            reservList.add(i);
        }
        for(int i : lost){
            if(reservList.contains(i)){
                reservList.remove(i);
            }else{
                lostList.add(i);
            }
        }


        for (Integer integer : lostList) {
            isChecked[integer] = false;
        }

        for(int i = 0; i < reservList.size(); i++){
            if(reservList.get(i) >1 && !isChecked[reservList.get(i) - 1]){
                isChecked[reserve[i] -1 ] = true;
            }else if(reservList.get(i) != n && !isChecked[reservList.get(i) + 1]){
                isChecked[reserve[i] + 1] = true;
            }
        }

        for (boolean b : isChecked) {
            if (b) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        TrainingClothes clothes = new TrainingClothes();
        int[] lost = new int[]{2,3,4};
        int[] reserve = new int[]{1,2,3,6};
        System.out.println(clothes.solution(7,lost,reserve));
    }
}
