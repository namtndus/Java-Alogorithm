package com.company.programmers.level1.failureRate;

import java.util.*;

public class FailureRate {

    public int[] solution(int N, int[] stages){

        Arrays.sort(stages);
        int index = 0;
        HashMap<Integer,Float> failuteRateList = new HashMap<>();

        for(int i = 1; i < N+1; i++){
            int man = 0;
            for(int j = index; j < stages.length; j++){
                if(i != stages[j]){
                    break;
                }
                ;
                man++;
            }
            if(stages.length - index >0){
                failuteRateList.put(i, (float)man / (stages.length - index));
            }else{
                failuteRateList.put(i, (float)0);
            }
            System.out.println("-----------------------------");
            index += man;
        }
        int[] answer = new int[failuteRateList.size()];
        List<Map.Entry<Integer, Float>> list_entries = new ArrayList<>(failuteRateList.entrySet());

        Collections.sort(list_entries, new Comparator<Map.Entry<Integer, Float>>() {
            @Override
            public int compare(Map.Entry<Integer, Float> obj1, Map.Entry<Integer, Float> obj2) {
                return obj2.getValue().compareTo(obj1.getValue());
            }
        });

        for(int i = 0; i<answer.length; i++){
            answer[i] = list_entries.get(i).getKey();
            System.out.println(list_entries.get(i).getValue());
        }
        System.out.println("---------------------------------");
        return answer;
    }

    public static void main(String[] args) {
        FailureRate rate = new FailureRate();
        int[] stages = {1,2,2,1,3};
        int[] result = rate.solution(5,stages);
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
}
