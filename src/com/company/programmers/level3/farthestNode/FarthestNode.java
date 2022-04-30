package com.company.programmers.level3.farthestNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FarthestNode {
    public int solution(int n, int[][] edge) {
        int answer = 0;
        int[] dist = new int[n+!];

        Arrays.fill(dist,Integer.MAX_VALUE);

        dijkstra(1, edge, dist);
        int max = 0;
        for(int i = 0; i< dist.length; i++){
            if(dist[i] == Integer.MAX_VALUE) continue;
            max = Math.max(max,dist[i]);
        }
        for(int i = 0; i < dist.length; i++){
            if(max == dist[i]) answer++;
        }

        return answer;

    }

    private void dijkstra(int start, int[][] edge, int[] dist) {
        dist[start] = 0;
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);

        while(!queue.isEmpty()){
            int pop = queue.remove();
            for(int i = 0; i < edge.length; i++){
                if(edge[i][0] == pop || edge[i][1] == pop){
                    int next = edge[i][1];
                    if(edge[i][1] == pop) next = edge[i][0];

                    if(dist[next] > dist[pop] +1){
                        dist[next] = dist[pop] +1;
                        queue.add(next);
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        FarthestNode node = new FarthestNode();
        int[][] edge = new int[][]{{3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}};
        System.out.println(node.solution(6, edge));
    }
}
