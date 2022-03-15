package com.company.class3.num1012;

import java.io.*;

public class OrganicCabbage {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sizeOfTest = Integer.parseInt(br.readLine());
        String[] mnk = br.readLine().split(" ");

        int weight = Integer.parseInt(mnk[0]);
        int height = Integer.parseInt(mnk[1]);
        int numOfCabbage = Integer.parseInt(mnk[2]);

        int[][] field = new int[height][weight];
        for(int i = 0; i<numOfCabbage; i++){
            mnk = br.readLine().split(" ");
            field[Integer.parseInt(mnk[0])][Integer.parseInt(mnk[0])] =1;
        }
    }
}
