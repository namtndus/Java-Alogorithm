package com.company.programmers.level3.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class Priorityqueue {
    public int[] solution(String[] operations){
        int[] answer = new int[2];
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for(String i : operations){
            String[] str = i.split(" ");
            if(str[0].equals("I")){
                maxHeap.add(Integer.parseInt(str[1]));
                minHeap.add(Integer.parseInt(str[1]));
            }else if(str[0].equals("D")){
                if(str[1].equals("1")){
                    if(!maxHeap.isEmpty()){
                        Integer num = maxHeap.remove();
                        minHeap.remove(num);
                    }
                }else{
                    if(!minHeap.isEmpty()){
                        Integer num = minHeap.remove();
                        maxHeap.remove(num);
                    }
                }
            }
        }

        answer[0] = maxHeap.isEmpty() ? 0 : maxHeap.element();
        answer[1] = minHeap.isEmpty() ? 0 : minHeap.element();
        return answer;

    }

    public static void main(String[] args) {
        Priorityqueue priQueue = new Priorityqueue();
        String[] operations = new String[]{"I 7","I 5","I -5","D -1"};
        int[] answer = priQueue.solution(operations);
        for(int i : answer){
            System.out.println(i);
        }
    }
}
