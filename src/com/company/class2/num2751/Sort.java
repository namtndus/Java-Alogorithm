package com.company.class2.num2751;

import java.io.*;
import java.util.Arrays;

public class Sort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        int[] list = new int[size];

        for(int i = 0; i<size; i++){
            list[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(list);
        for(int i = 0; i<size; i++){
            bw.write(list[i] + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
