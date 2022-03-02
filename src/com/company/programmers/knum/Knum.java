package com.company.programmers.knum;

import java.util.Arrays;

public class Knum {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] command = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[command.length];

        for(int i = 0; i<command.length; i++){
            int[] copyArr = Arrays.copyOfRange(array, command[i][0] -1,command[i][1]);
            Arrays.sort(copyArr);
            answer[i] = copyArr[command[i][2]-1];
        }

        for(int i : answer){
            System.out.println(i);
        }
    }
}
