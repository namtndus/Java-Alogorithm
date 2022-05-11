package com.company.programmers.level2.print;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Print {
    public int solution(int[] priorities, int location){

        int answer = 0;
        int position = priorities.length-1;
        Queue<Integer> queue = new LinkedList<>();
        for(int i : priorities){
            queue.add(i);
        }
        Arrays.sort(priorities);


        while(!queue.isEmpty()){
            if(queue.peek().equals(priorities[position])){
                if(location == 0){
                    ++answer;
                    break;
                }
                answer++;
                location--;
                queue.remove();
                position--;
            }else{
                if(location == 0){
                    location = queue.size()-1;
                }else{
                    location--;
                }
                int num = queue.remove();
                queue.add(num);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Print print = new Print();
        int[] priorities = new int[]{2,1,3,2};
        int[] priorities1 = new int[]{1,1,9,1,1,1};
        System.out.println(print.solution(priorities1,0));
    }
}
