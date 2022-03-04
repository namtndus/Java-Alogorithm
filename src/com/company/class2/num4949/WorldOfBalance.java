package com.company.class2.num4949;

import java.io.*;

public class WorldOfBalance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();

        while(word == "."){
            find(word);
            word = br.readLine();
        }
    }

    private static void find(String word) {

    }
}
