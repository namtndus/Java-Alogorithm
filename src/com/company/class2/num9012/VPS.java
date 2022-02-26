package com.company.class2.num9012;

import java.io.*;

public class VPS {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int size = Integer.parseInt(br.readLine());

        for(int i = 0; i<size; i++){
            char[] array = br.readLine().toCharArray();
            int front = 0;
            int back = 0;
            for(int j = 0; j<array.length; j++){
                if(array[j] == '('){
                    front +=1;
                }else{
                    back+=1;
                    if(back > front){
                        bw.write("NO"+ "\n");
                        break;
                    }
                }
            }
            if(back == front){
                bw.write("YES" + "\n");
            }else{
                if(back< front){
                    bw.write("NO" + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
