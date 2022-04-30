package com.company.programmers.level1.trainingClothes;

import java.util.*;
public class Training {
    public int solution(int n, int[] lost, int[] reserve){
        HashSet<Integer> resList = new HashSet<>();
        HashSet<Integer> losList = new HashSet<>();

        for(int i : reserve){
            resList.add(i);
        }
        for(int i : lost){
            if(resList.contains(i)){
                resList.remove(i);
            }else{
                losList.add(i);
            }
        }

        for(int i : resList){
            if(losList.contains(i -1)){
                losList.remove(i-1);
            }else if(losList.contains(i+1)){
                losList.remove(i+1);
            }
        }

        return n - losList.size();
    }

    public static void main(String[] args) {
        Training training = new Training();
        int[] loat = new int[]{2,3,4};
        int[] reserve = new int[]{1,2,3,6};

        System.out.println(training.solution(7,loat,reserve));
    }

}
