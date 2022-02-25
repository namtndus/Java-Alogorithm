package com.company.class2.num10845;

import java.io.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.StringTokenizer;

public class Queue {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        // Queue을 저장하기위한 리스트이다
        ArrayList<Integer> list = new ArrayList<>();
        // 명령의 수를 저장하는 변수
        int size = Integer.parseInt(br.readLine());

        for(int i = 0; i<size; i++){
            st = new StringTokenizer(br.readLine()," ");
            String command = st.nextToken();
            if(command.equals("push")){
                list.add(Integer.parseInt(st.nextToken()));
            }else if(command.equals("pop")){
                if(list.size() == 0){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(list.remove(0) + "\n");
                }
            }else if(command.equals("front")){
                if(list.size() == 0){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(list.get(0) + "\n");
                }
            }else if(command.equals("back")){
                if(list.size() == 0){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(list.get(list.size()-1) + "\n");
                }
            }else if(command.equals("empty")){
                if(list.size() == 0){
                    bw.write(1 + "\n");
                }else{
                    bw.write(0 + "\n");
                }
            }else{
                bw.write(list.size() + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
