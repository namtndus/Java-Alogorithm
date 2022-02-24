package com.company.class2.num1920;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class FindOfNum {
    public static void main(String[] args) throws IOException {
        // 이분 탐색
        // 받은 리스트를 정렬하여


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bW = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int arraySize = Integer.parseInt(br.readLine());
        ArrayList<Integer> arrayList = new ArrayList<>();
        String inputText = br.readLine();
        st = new StringTokenizer(inputText," ");
        for(int i = 0; i<arraySize; i++){
            int num = Integer.parseInt(st.nextToken());
            arrayList.add(num);
        }
        int size = Integer.parseInt(br.readLine());
        Collections.sort(arrayList);

        st = new StringTokenizer(br.readLine()," ");
        for(int i =0; i<size; i++){
            int input = Integer.parseInt(st.nextToken());
            if(Collections.binarySearch(arrayList,input)>=0){
                bW.write(1+"\n");
            }else{
                bW.write(0+"\n");
            }
        }
        bW.flush();
        br.close();
        bW.close();
    }
}
