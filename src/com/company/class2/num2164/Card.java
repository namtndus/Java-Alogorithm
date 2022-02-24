package com.company.class2.num2164;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Card {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<>();

        int size = Integer.parseInt(br.readLine());
        for(int i = 1; i<=size; i++){
            list.add(i);
        }

        while(true){
            list.remove(0);
            if(list.size() == 1){
                break;
            }
            list.add(list.get(0));
            list.remove(0);
        }

        bw.write(list.get(0)+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
