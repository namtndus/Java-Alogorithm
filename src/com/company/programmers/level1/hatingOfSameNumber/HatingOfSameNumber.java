package com.company.programmers.level1.hatingOfSameNumber;

import java.util.Stack;

public class HatingOfSameNumber {
    public int[] solution(int[] arr){
        int[] answer;

        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            if(stack.empty()){
                stack.push(arr[i]);
            }else if(!stack.peek().equals(arr[i])){
                stack.push(arr[i]);
            }
        }
        answer = new int[stack.size()];

        for(int i = 0; i< answer.length; i++){
            answer[i] = stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        HatingOfSameNumber num = new HatingOfSameNumber();
        int[] arr = {1,1,3,3,0,1,1};
        int[] arr1 = num.solution(arr);
        for(int i = 0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
