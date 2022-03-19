package com.company.class3.num11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class NumOfConnectedComponentBfs {
    static int[][] graph;
    static boolean[] isChecked;
    static int N;
    static int M;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
         N = Integer.parseInt(st.nextToken());
         M = Integer.parseInt(st.nextToken());
         graph = new int[N+1][N+1];
         isChecked = new boolean[N+1];

         for(int i = 0; i<M; i++){
             st = new StringTokenizer(br.readLine());
             int x = Integer.parseInt(st.nextToken());
             int y = Integer.parseInt(st.nextToken());

             graph[x][y] = graph[y][x] = 1;
         }

         for(int i = 1; i <= N; i++){
             if(!isChecked[i]){
                 bfs(i);
                 count++;
             }
         }
         System.out.println(count);
    }

    private static void bfs(int x) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(x);
        isChecked[x] = true;

        while(!queue.isEmpty()){
            int index =queue.poll();
            isChecked[index] = true;
            for(int i = 1; i<=N; i++){
                if(!isChecked[i] && graph[index][i] == 1){
                    queue.offer(i);
                    isChecked[i] = true;
                }
            }

        }
    }
}
