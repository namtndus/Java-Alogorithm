package com.company.class3.num11724;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumOfConnectedComponentDfs {

    static int[][] graph;
    static boolean[] isChecked;
    static int N;
    static int M;
    static int count;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph= new int[N+1][N+1];
        isChecked = new boolean[N+1];

        for(int i = 0; i < M; i++){
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }
        for(int i = 1; i<=N; i++){
            if(!isChecked[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);
    }

    private static void dfs(int x) {
        isChecked[x] = true;
        for(int y = 1; y <= N; y++){
            if(!isChecked[y] && graph[x][y] == 1){
                dfs(y);
            }
        }
    }
}
