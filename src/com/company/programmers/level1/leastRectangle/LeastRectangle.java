package com.company.programmers.level1.leastRectangle;

import com.company.class1.num10871.Min;

public class LeastRectangle {
    public int solution(int[][] sizes){
        int[] Max = new int[sizes.length];
        int[] Min = new int[sizes.length];
        int xIndex = 0;
        int xMax = Integer.MIN_VALUE;
        int yMax = Integer.MIN_VALUE;
        int yIndex = 0;


        for(int i = 0; i< sizes.length; i++){
            if(sizes[i][0] >= sizes[i][1]){
                Max[i] = sizes[i][0];
                Min[i] = sizes[i][1];
            }else{
                Max[i] = sizes[i][1];
                Min[i] = sizes[i][0];
            }
            if(xMax < Max[i]){
                xMax = Max[i];
                xIndex = i;
            }
            if(yMax < Min[i]){
                yMax = Min[i];
                yIndex = i;
            }
        }
        return Max[xIndex] * Min[yIndex];
    }
}
