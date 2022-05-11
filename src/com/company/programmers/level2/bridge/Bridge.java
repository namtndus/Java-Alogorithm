package com.company.programmers.level2.bridge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bridge {
    public int solution(int bridge_length, int weight, int[] truck_weights){
        int time = 0;
        int bridge_weight = 0;

        // 대기 틀럭
        Queue<Integer> truck = new LinkedList<>();
        // 다리를 건너는 트럭
        Queue<Integer> bridge = new LinkedList<>();
        // 다리를 지난 트럭
        Stack<Integer> target = new Stack<>();
        for(int i : truck_weights){
            truck.add(i);
        }
        for(int i = 0; i<weight; i++){
            bridge.add(0);
        }

        while(truck.isEmpty() && bridge.isEmpty()){
            if(bridge_weight + truck.peek() <= weight){
                int num = truck.remove();
                bridge.add(num);
                bridge_weight+= num;
            }
        }

        return time;
    }

    public static void main(String[] args) {
        Bridge bridge = new Bridge();
        int[] truck_weights = new int[]{7,4,5,6};
    }
}
