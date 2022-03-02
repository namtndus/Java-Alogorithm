package com.company.programmers.findNum;

import java.io.*;
import java.util.StringTokenizer;

public class FindNum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String arr = br.readLine();
        boolean[] list = new boolean[10];
        int sum = 0;

        for(int i = 0; i<arr.length(); i++){
            int tmp = Integer.parseInt(arr[i]);
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
