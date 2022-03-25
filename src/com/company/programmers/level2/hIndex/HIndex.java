package com.company.programmers.level2.hIndex;

import java.util.Arrays;

public class HIndex {

    static int[] citations = {3,0,6,1,5};

    public static void main(String[] args) {

        Arrays.sort(citations);
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < citations.length; i++){
            int count = i;
            for(int j = i+1; j < citations.length; j++){
                if(citations[i] < citations[j]){
                    count++;
                }
            }
            if(max < count){
                max = count;
            }
        }

        System.out.println(max-1);
    }
}
