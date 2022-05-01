package com.company.programmers.level2.joystick;

public class Joystick {

    static int count = 0;

    public int solution(String name){

        boolean[] isChecked = new boolean[name.length()];
        int[] x = new int[]{1,-1};
        char answer = 'A';
        char[] str = name.toCharArray();

        changeChar(x,str,answer,isChecked,0);

        count += name.length()-1;

        return count;
    }

    private void changeChar(int[] x, char[] str, char answer,boolean[] isChecked, int order) {
        int num = str[order] - answer;
        if(num >= 13){
            num = Math.abs(num-26);
        }
        
    }

    public static void main(String[] args) {
        Joystick joystick = new Joystick();
        System.out.println(joystick.solution("JAZ"));
    }

}
