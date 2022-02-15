package com.company.class2.num11650;

import java.util.Arrays;
import java.util.Scanner;

public class SortLoc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 몇 개의 점이 주어졌는지 확인한다.
        int size = sc.nextInt();
        int[][] line = new int[size][2];

        // 점을 출력하는 것부터 작성한다.
        for(int i = 0; i < size; i++){
            line[i][0] = sc.nextInt();
            line[i][1] = sc.nextInt();
        }

        // 정렬한다.
        Arrays.sort(line, (e1, e2) -> {
            if(e1[0] == e2[0]){
                return e1[1] - e2[1];
            } else {
                return e1[0] - e2[0];
            }
        });

        //출력한다.
        for(int i = 0; i < size; i++){
            System.out.println(line[i][0]+" "+line[i][1]);
        }
    }
}
