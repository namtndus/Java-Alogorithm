package com.company.class2.num1181;

import javax.swing.plaf.IconUIResource;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class SortWord {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // 단어 길이가 같을 경우
                if(s1.length() == s2.length()){
                    return s1.compareTo(s2);
                }else{
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append('\n');

        for(int i = 1; i < N; i++){
            if(!arr[i].equals(arr[i - 1])){
                sb.append(arr[i]).append('\n');
            }
        }
        System.out.println(sb);

    }
}
