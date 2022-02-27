package com.company.class2.num2751;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < N; i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(list);

        for(int value : list){
            sb.append(value).append('\n');
        }
        System.out.println(sb);
    }
}
