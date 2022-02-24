package com.company.class2.num1181;

import javax.swing.plaf.IconUIResource;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class SortWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int size = Integer.parseInt(br.readLine());
        String[] str = new String[size];
        int length = 0;
        int index = 0;

        for(int i = 0; i< size; i++){
            String word = br.readLine();
            if(i == 0){
                length = word.length();
            }
            str[i] = word;
        }

        for(int i = 0; i<str.length; i++){
            length = str[i].length();
            index = i;
            for(int j = i; j < str.length; j++){
                if(i == j ){
                    continue;
                }
                if(length > str[j].length()){
                    length =str[j].length();
                    index = j;
                }else if(length == str[j].length()){
                    for(int z = 0; z<str[j].length(); z++){
                        if(str[index].toCharArray()[z] > str[j].toCharArray()[z]){
                            index = j;
                        }else if(str[index].toCharArray()[z] == str[j].toCharArray()[z]){
                            continue;
                        }else{
                            break;
                        }
                    }
                }
            }
            bw.write(str[index] + "\n");
            String good = str[i];
            str[i] = str[index];
            str[index] = good;
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
