package com.company.programmers.level2.spicy;

import java.util.*;

public class Spicy {

    public int solution(int[] scoville, int K){
        int count = 0;


        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i = 0; i < scoville.length; i++){
            queue.add(scoville[i]);
        }
        while(queue.size() != 1){
            int num = queue.remove();
            if(num < K ){
                count++;
                num = num + queue.remove() * 2;
                queue.add(num);
            }
        }
        if(queue.peek() <K){
            return -1;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] scoville = new int[]{0,1,2,3};
        Spicy spicy = new Spicy();
        System.out.println(spicy.solution(scoville,1));

    }

}
