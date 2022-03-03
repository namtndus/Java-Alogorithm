package com.company.class2.num11866;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class JosephusProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int size = Integer.parseInt(st.nextToken());
        int num  = Integer.parseInt(st.nextToken());

        int index = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <= size; i++){
            list.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append('<');
        for(int i = 0; i<size-1; i++){
            index = (index +(num-1)) % list.size();
            sb.append(list.remove(index)).append(", ");
        }

        sb.append(list.remove(0)).append('>');
        System.out.println(sb);
        br.close();
    }
}
