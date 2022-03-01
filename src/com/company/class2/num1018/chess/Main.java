package com.company.class2.num1018.chess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // 먼저 W 가로 길이, H 세로의 길이
        // 직사각형의 패턴들이 입력이 됨

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int H = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());

        boolean pattern[][] = new boolean[H][W];

        for(int i = 0; i<H; i++){
            char[] arr = br.readLine().toCharArray();
            for(int j = 0; j<arr.length; j++){
                if(arr[j] == 'W'){
                    pattern[i][j] = true;
                }else{
                    pattern[i][j] = false;
                }
            }
        }

        int min_H = H - 7; // 세로의 길이
        int min_W = W - 7; // 가로의 길이
        int bordNum = 64; // 두 가지 의 경우의 수를 구하기 위한 변수
        int min = 64; // 최소값을 저장하기 위한 변수

        boolean pk = pattern[0][0];  // 다음의 패턴을 판단을 가능하게 하는 변수
        for(int i = 0; i<min_H; i++){
            for(int j = 0; j<min_W; j++ ){
                int count = 0; // 패턴이 일치하지 않을 경우 증가되는 변수
                for(int z = i; z<i+8; z++){
                    for(int k = j; k<j+8; k++){
                        if(pattern[z][k] != pk){
                            count ++;
                        }
                        pk = !pk; // 다음 칸의 색깔 변경의 위한 초기화
                    }
                    pk = !pk; // 다음 줄의 동일 칸의 색을 위한 초기화
                }
                count = Math.min(count, bordNum - count);
                min = Math.min(min, count);
            }
        }

        System.out.println(min);
        
    }
}
