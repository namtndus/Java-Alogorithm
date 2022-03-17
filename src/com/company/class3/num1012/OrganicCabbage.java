package com.company.class3.num1012;

import java.io.*;
import java.util.StringTokenizer;

public class OrganicCabbage {
    static int M, N, K;
    static int[][] cabbage;
    static boolean[][] isChecked;
    static int count;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sizeOfTest = Integer.parseInt(br.readLine());

        for(int i = 0; i<sizeOfTest; i++){
            count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            cabbage = new int[M][N];
            isChecked = new boolean[M][N];

            K = Integer.parseInt(st.nextToken());

            for(int j = 0; j<K; j++){
                st = new StringTokenizer(br.readLine()," ");
                int row = Integer.parseInt(st.nextToken());
                int col = Integer.parseInt(st.nextToken());
                cabbage[row][col] =1;
            }

            for(int x = 0; x < M; x++){
                for(int y = 0; y < N; y++){
                    if(!isChecked[x][y] && cabbage[x][y] == 1){
                        dfs(x,y);
                        count++;
                    }
                }
            }
            bw.write(count+ "\n");
        }
        bw.flush();
        bw.close();

    }

    private static void dfs(int x, int y) {
        isChecked[x][y] = true;
        for(int i = 0; i < 4; i++){
            int cx = x + dx[i];
            int cy = y + dy[i];

            if(cx >= 0 && cy >= 0 && cx < M && cy < N){
                if(!isChecked[cx][cy] && cabbage[cx][cy] == 1){
                    dfs(cx,cy);
                }
            }
        }

    }
}
