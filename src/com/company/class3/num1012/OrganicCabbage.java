package com.company.class3.num1012;

import java.io.*;
import java.util.StringTokenizer;

public class OrganicCabbage {
    static int num = 0;
    static int[][] field = new int[51][51];
    static boolean[][] isChecked = new boolean[51][51];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sizeOfTest = Integer.parseInt(br.readLine());

        for(int i = 0; i<sizeOfTest; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int weight = Integer.parseInt(st.nextToken());
            int height = Integer.parseInt(st.nextToken());
            int numOfCabbage = Integer.parseInt(st.nextToken());

            for(int j = 0; j<numOfCabbage; j++){
                st = new StringTokenizer(br.readLine()," ");
                field[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] =1;
            }

            for(int j = 0; j<weight; j++){
                for(int z = 0; z<height; z++){
                    if(isChecked[j][z] != true && field[j][z] == 1){
                        int size = bfs(j,z);
                        if(size >0){
                            num +=1;
                        }
                    }
                }
            }
            bw.write(num+ "\n");
            num = 0;
        }
        bw.flush();
        bw.close();

    }

    private static int bfs(int i, int j) {
        int bSize = 0;
        for(int a = j; a<field[i].length; a++){
            if(field[i][a] == 1){
                isChecked[i][a] = true;
                bSize+=1;
                bSize += dfs(i,a);
            }else{
                break;
            }
        }
        return bSize;
    }

    private static int dfs(int i, int a) {
        int dsize = 0;
        for(int b = i+1; b<field.length; b++){
            if(field[b][a] == 1){
                isChecked[b][a] = true;
                dsize += 1;
            }else{
                break;
            }
        }
        return dsize;
    }
}
