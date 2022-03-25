package com.company.programmers.level2.dividArray;

import java.util.ArrayList;
import java.util.Arrays;

public class DividArray {

    static int[] arr = {2, 36,1,3};
    static int divisor = 1;

    public static void main(String[] args) {
        int[] answer;
        Arrays.sort(arr);
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor ==0){
                list.add(arr[i]);
            }
        }

        if(list.size() == 0){
            System.out.println(-1);
        }else{
            answer = new int[list.size()];
            for(int i = 0; i<list.size(); i++){
                answer[i] = list.get(i);
                System.out.println(list.get(i));
            }
        }

    }

}
