package com.company.class2.num2775;

import java.util.Scanner;

public class President {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //아파트 생성
        int[][] APT = new int[15][15];

        for(int i = 0; i < 15; i++){
            APT[i][1] = 1; // 1층 1호
            APT[0][i] = i; // i층 1호
        }

        for(int i = 1; i < 15; i++){
            for(int j = 2; j<15; j++){
                APT[i][j] = APT[i][j - 1] + APT[i-1][j];
            }
        }

        //테스트 부분
        int T = sc.nextInt();

        for(int i = 0; i < T; i++){
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(APT[k][n]);
        }
    }
}
