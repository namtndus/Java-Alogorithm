package com.company.class2.num10773;

import java.io.*;
import java.util.ArrayList;

public class Zero {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> stack = new ArrayList<>();
        int total = 0;

        for(int i = 0; i < size; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                if(stack.size() != 0){
                    stack.remove(stack.size() - 1);
                }
            }else{
                stack.add(num);
            }
        }

        for(int num : stack){
            total += num;
        }

        bw.write(total + "\n");
        bw.close();
        br.close();
    }
}
