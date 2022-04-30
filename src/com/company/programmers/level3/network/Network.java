package com.company.programmers.level3.network;

import java.util.LinkedList;
import java.util.Queue;

public class Network {

    public int solution(int n, int[][] computers){
        boolean[] isChecked = new boolean[n];
        int answer = 0;
        for(int i = 0; i<n; i++){
            if(!isChecked[i]){
                answer += bfs(isChecked,computers,i);
            }
        }
        return answer;

    }

    private int bfs(boolean[] isChecked, int[][] computers,int index) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(index);
        while(!queue.isEmpty()){
            int front = queue.remove();
            isChecked[front] = true;
            for(int i = index; i<isChecked.length; i++){
                if(computers[front][i] ==1 && !isChecked[i]){
                    queue.add(i);
                }
            }

        }
        return 1;
    }

    public static void main(String[] args) {
        Network network = new Network();
        int[][] computers = {{1,1,0,0},{1,1,0,0},{0,0,1,1},{0,0,1,1}};
        System.out.println(network.solution(4,computers));
    }
}
