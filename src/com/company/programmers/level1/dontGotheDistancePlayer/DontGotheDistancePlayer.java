package com.company.programmers.level1.dontGotheDistancePlayer;

public class DontGotheDistancePlayer {
    static String[] participant = {"mislav", "stanko", "mislav", "ana"};
    static String[] completion = {"stanko", "ana", "mislav"};

    public static void main(String[] args) {
        boolean[] isChecked = new boolean[participant.length];
        for(int i = 0; i<participant.length; i++){
            for(int j = 0; j< completion.length; j++ ){
                if(participant[i].equals(completion[j])){
                    isChecked[i] = true;
                    break;
                }
            }
        }

        for(int i = 0; i<isChecked.length; i++){
            if(!isChecked[i]){
                System.out.println(participant[i]);
            }
        }
    }
}
