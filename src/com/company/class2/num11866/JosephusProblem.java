package com.company.class2.num11866;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class JosephusProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int size = Integer.parseInt(st.nextToken());
        int index = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i<=size; i++){
            list.add(i);
        }

        for(int i = 0; i<size; i++){
            bw.write(list.remove(index-1) + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
