package com.company.class2.num1929;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean arr[] = new boolean[n+1];

        arr[0] = true;
        arr[1] = true;

        for(int i = 2; i<=Math.sqrt(n+1); i++){
            for(int j = i*i; j<n+1; j+=i){
                arr[j] = true;
            }
        }

        for(int i = m; i<n+1; i++){
            if(arr[i] == false){
                bw.write(i + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}
