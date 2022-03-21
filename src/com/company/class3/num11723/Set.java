package com.company.class3.num11723;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Set {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());
        ArrayList<Integer> set = new ArrayList<>();

        for(int i = 0; i<size; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            String word = st.nextToken();
            Integer num;
            if(word.equals("add")){
                num = Integer.parseInt(st.nextToken());
                if(!set.contains(num)){
                    set.add(num);
                }
            }else if(word.equals("remove")){
                num = Integer.parseInt(st.nextToken());
                if(set.contains(num)){
                    set.remove(num);
                }
            }else if(word.equals("check")){
                num = Integer.parseInt(st.nextToken());
                if(set.contains(num)){
                    bw.write(1+"\n");
                }else{
                    bw.write(0+"\n");
                }
            }else if(word.equals("toggle")){
                num = Integer.parseInt(st.nextToken());
                if(set.contains(num)){
                    set.remove(num);
                }else{
                    set.add(num);
                }
            }else if(word.equals("all")){
                set.clear();
                for(int j = 1; j<=20; j++){
                    set.add(j);
                }
            }else if(word.equals("empty")){
                set.clear();
            }

        }

        bw.flush();
        br.close();
        bw.close();

    }
}
