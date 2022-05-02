package com.company.programmers.level2.joystick;

public class Joystick {

    static int count = 0;

    public int solution(String name){

        boolean[] isChecked = new boolean[name.length()];
        char[] str = name.toCharArray();

        changeChar(str,isChecked,0);


        return count;
    }

    private void changeChar(char[] str,boolean[] isChecked, int order) {

        if(isChecked[order]){
            return ;
        }

        if(order != 0){
            count++;
        }
        isChecked[order] = true;
        int num = str[order] - 'A';
        if(num >= 13){
            num = Math.abs(num-26);
        }
        count += num;
        int leftNum = order - 1;
        int rightNum = order + 1;

        if(rightNum >= str.length){
            rightNum -= str.length;
        }
        if(leftNum < 0 ){
            leftNum += str.length;
        }
        if(str[rightNum] == 'A'){
            isChecked[rightNum] = true;
        }else{
            changeChar(str, isChecked, rightNum);
        }
        if(str[leftNum] == 'A'){
            isChecked[leftNum] = true;
        }else{
            changeChar(str,isChecked,leftNum);
        }

    }

    public static void main(String[] args) {
        Joystick joystick = new Joystick();
        System.out.println(joystick.solution("ABABAAAAABA"));
    }

}
