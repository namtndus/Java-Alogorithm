package com.company.programmers.level3.farthestNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FarthestNode {
    public int solution(int n, int[][] edge) {
        int size = 0;
        int[] isChecked = new int[n + 1];
        Arrays.fill(isChecked, Integer.MAX_VALUE);
        isChecked[0] = 0;
        isChecked[1] = 0;
        boolean[][] graph = new boolean[n + 1][n + 1];
        for (int i = 0; i < edge.length; i++) {
            graph[edge[i][0]][edge[i][1]] = true;
            graph[edge[i][1]][edge[i][0]] = true;
        }

        dfs(isChecked, graph,0,1);

        int answer = 0;

        for (int i = 2; i < isChecked.length; i++) {
            if (answer < isChecked[i]) {
                answer = isChecked[i];
            }
        }
        for(int i = 2; i<isChecked.length; i++){
            if(answer == isChecked[i]){
                size++;
            }
        }


        return size;
    }

    private void dfs(int[] isChecked, boolean[][] graph, int num, int x) {
       for(int j = 2; j< isChecked.length; j++){

       }
    }

    public static void main(String[] args) {
        FarthestNode node = new FarthestNode();
        int[][] edge = new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        System.out.println(node.solution(6, edge));
    }
}
