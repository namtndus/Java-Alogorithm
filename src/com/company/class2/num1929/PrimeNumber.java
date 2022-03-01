package com.company.class2.num1929;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PrimeNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = start; i <= end; i++){
            if(isPrimeNumber(i)){
                list.add(i);
            }
        }

        for(int i = 0; i<list.size(); i++){
            bw.write(list.get(i) + "\n");

        }
        bw.flush();
        bw.close();
        br.close();
    }

    private static boolean isPrimeNumber(int x) {
        int end = (int) Math.sqrt(x);

        for(int i = 2; i <= end; i++){

            if(x % i == 0)return false;

        }

        return true;
    }
}
