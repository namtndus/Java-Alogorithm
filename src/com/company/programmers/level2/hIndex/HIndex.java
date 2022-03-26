package com.company.programmers.level2.hIndex;

import java.util.Arrays;

public class HIndex {

    static int[] citations = {3,0,6,1,5};

    public static void main(String[] args) {
        int answer = 0;

        Arrays.sort(citations);

        for(int i = 0; i < citations.length; i++){
            int h = citations.length - i;

            if(citations[i] >= h){
                answer = h;
                break;
            }
        }

        System.out.println(answer);
    }
}
