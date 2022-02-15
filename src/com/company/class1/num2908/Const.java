package com.company.class1.num2908;

import java.util.Scanner;

public class Const {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] char1 = sc.next().toCharArray();
        char[] char2 = sc.next().toCharArray();
        String answer = "";
        for(int i = 2; i>=0; i--){
            if(char1[i]>char2[i]){
                for(int j = 2; j>=0; j--) {
                    answer += char1[j];
                }
                System.out.println(answer);
                return ;
            }else if(char1[i]<char2[i]){
                for(int j = 2; j>=0; j--){
                    answer += char2[j];
                }
                System.out.println(answer);
                return ;
            }
        }
    }
}
