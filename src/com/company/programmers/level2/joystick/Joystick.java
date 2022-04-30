package com.company.programmers.level2.joystick;

public class Joystick {

    public int solution(String name){
        int count = 0;
        char answer = 'A';
        char[] str = name.toCharArray();
        for(char i : str){
            int num = i - answer;
            if(num >= 13){
                num = Math.abs(num-26);
            }
            count += num;
        }

        count += name.length()-1;

        return count;
    }

    public static void main(String[] args) {
        Joystick joystick = new Joystick();
        System.out.println(joystick.solution("JAZ"));
    }

}
