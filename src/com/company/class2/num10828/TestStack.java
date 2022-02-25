package com.company.class2.num10828;

import java.io.*;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class TestStack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st ;

        ArrayList<Integer> stack = new ArrayList<>();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i<n; i++){
            st = new StringTokenizer(br.readLine()," ");
            String command = st.nextToken();
            if(command.equals("push")){
                int num = Integer.parseInt(st.nextToken());
                stack.add(num);

            }else if(command.equals("pop")){
                if(stack.size() == 0){
                    bw.write(-1+"\n");
                }else {

                    bw.write(stack.remove(stack.size() - 1)  + "\n");
                }
            }else if(command.equals("size")){
                bw.write(stack.size() + "\n");
            }else if(command.equals("empty")){
                if(stack.size() == 0){
                    bw.write(1 + "\n");
                }else{
                    bw.write(0 + "\n");
                }
            }else{
                if(stack.size() == 0){
                    bw.write(-1+"\n");
                }else{
                    bw.write(stack.get(stack.size() - 1)+ "\n");
                }

            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
}
