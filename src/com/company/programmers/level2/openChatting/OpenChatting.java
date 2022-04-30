package com.company.programmers.level2.openChatting;

import java.util.ArrayList;
import java.util.HashMap;

public class OpenChatting {

    public String[] solution(String[] record){

        String[][] info = new String[record.length][2];
        HashMap<String, String> nickNames = new HashMap<>();
        ArrayList<String> answer = new ArrayList<>();

        for(int i = 0; i<record.length; i++){
            String[] inputs = record[i].split(" ");
            info[i][0] = inputs[0];
            info[i][1] = inputs[1];
            if(!inputs[0].equals("Leave")){
                nickNames.put(inputs[1],inputs[2]);
            }
        }

        for(int i = 0; i<info.length; i++){
            if(info[i][0].equals("Enter")){
                answer.add(nickNames.get(info[i][1])+"님이 들어왔습니다.");
            }else if(info[i][0].equals("Leave")){
                answer.add(nickNames.get(info[i][1])+"님이 나갔습니다.");
            }
        }

        return answer.toArray(new String[0]);
    }

    public static void main(String[] args) {
        OpenChatting chat = new OpenChatting();
        String[] record = new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"};
        String[] result = chat.solution(record);
        for(String i : result){
            System.out.println(i);
        }
    }
}
