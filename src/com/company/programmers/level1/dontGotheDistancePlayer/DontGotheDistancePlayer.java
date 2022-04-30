package com.company.programmers.level1.dontGotheDistancePlayer;

import java.util.ArrayList;
import java.util.Arrays;

public class DontGotheDistancePlayer {
    public String solution(String[] participant, String[] completion){
        // 맨 처음에 생각한 코드
//        String answer = "";
//        ArrayList<String> partiList = new ArrayList<>(Arrays.asList(participant));
//        for(String i : completion){
//            if(partiList.contains(i)){
//                partiList.remove(i);
//            }
//        }
//
//        answer = partiList.get(0);
//
//        return answer;
        String answer = "";
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i<completion.length; i++){
            if(!completion[i].equals(participant[i])){
                answer = participant[i];
                break;
            }
        }

        if(answer.equals("")) answer = participant[participant.length-1];

        return answer;
    }

    public static void main(String[] args) {
        DontGotheDistancePlayer player = new DontGotheDistancePlayer();
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
        System.out.println(player.solution(participant,completion));
    }
}
