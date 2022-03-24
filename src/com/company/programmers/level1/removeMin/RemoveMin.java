package com.company.programmers.level1.removeMin;

import java.util.Arrays;

public class RemoveMin {
    static int[] arr = {4,3,2,1};

    public static void main(String[] args) {

        int[] answer = new int[arr.length == 1 ? 1: arr.length-1];
        int min = Integer.MAX_VALUE;
        int index = 0;

        if(arr.length ==1){
            arr[0] = -1;
        }

        for(int i = 0; i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(i == index){
                continue;
            }else if(i > index){
                answer[i-1] = arr[i];
            }else{
                answer[i] = arr[i];
            }
        }
    }
}
