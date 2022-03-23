package com.company.programmers.level1.findNum;

import java.io.*;

public class FindNum {
    public static void main(String[] args) throws IOException {
        int[] arr = {1,2,3,4,5,6,7,8,0};// dlqcnfr
        boolean[] list = new boolean[10];
        int sum = 0;

        for(int i = 0; i<arr.length; i++){
            int tmp = arr[i];
            list[tmp] = true;
        }

        for(int i =0; i<list.length; i++){
            if(list[i]  == false){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
