package com.company.programmers.level1.strangeMessage;


public class StrangeMessage {

    public String solution(String s){
        String answer = "";
        String[] str = s.split("");
        int index = 0;

        for(int i = 0; i < str.length; i++){
            if(str[i].equals(" ") ){
                index = 0;
                answer += str[i];
            }else if(index % 2 == 0){
                answer += str[i].toUpperCase();
                index +=1;
            }else{
                answer += str[i].toLowerCase();
                index +=1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        StrangeMessage strangeMessage = new StrangeMessage();

        System.out.println(strangeMessage.solution("try hello world"));

    }
}
