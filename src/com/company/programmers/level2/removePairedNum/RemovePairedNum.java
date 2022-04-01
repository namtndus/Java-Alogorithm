package com.company.programmers.level2.removePairedNum;

import java.util.Stack;

public class RemovePairedNum {

    public int solution(String s){
        int answer = 0;
        //stack으로 구현 할 것임
        Stack<String> stack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
            if(stack.empty()){
                stack.push(s.substring(i,i+1));
            }else{
                if(stack.peek().equals(s.substring(i,i+1))){
                    stack.pop();
                }else{
                    stack.push(s.substring(i,i+1));
                }
            }
        }

        if(stack.empty()){
            answer = 1;
        }else{
            answer = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        RemovePairedNum pairedNum = new RemovePairedNum();
        System.out.println(String.valueOf(pairedNum.solution("cdcd")));
    }
}
