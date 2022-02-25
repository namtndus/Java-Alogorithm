package com.company.class2.num10866;

import java.io.*;
import java.util.*;

public class Deque {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        ArrayList<Integer> list = new ArrayList<>();
        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i<size; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();
            if(command.equals("push_front")){
                list.add(0,Integer.parseInt(st.nextToken()));
            }else if(command.equals("push_back")){
                list.add(Integer.parseInt(st.nextToken()));
            }else if(command.equals("pop_front")){
                if(list.size() == 0){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(list.remove(0) + "\n");
                }
            }else if(command.equals("pop_back")){
                if(list.size() == 0){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(list.remove(list.size()-1) + "\n");
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
            }else if(command.equals("size")){
                bw.write(list.size() + "\n");
            }else{
                if(list.size() == 0){
                    bw.write(1 + "\n");
                }else{
                    bw.write(0 + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
