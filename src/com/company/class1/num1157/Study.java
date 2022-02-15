package com.company.class1.num1157;

import java.util.Arrays;
import java.util.Scanner;

public class Study {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] word = sc.next().toUpperCase().toCharArray();
        Arrays.sort(word);
        boolean isChecked = false;
        int max = 0;
        int same = 0;
        char charcter = ' ';
        for(int i = 0; i < word.length; i++){
            same +=1;
            if(i != word.length-1 && word[i]!=word[i+1]){
                if(max < same){
                    isChecked = false;
                    max = same;
                    charcter = word[i];
                }else if(max == same){
                    isChecked = true;
                }
                same = 0;
            }
            if(i == word.length-1){
                if(max < same){
                    isChecked = false;
                    max = same;
                    charcter = word[i];
                }else if(max == same){
                    isChecked = true;
                }
            }

            // same을 증가한다
            // word의 인덱스 i와 i+1이 다르면 1로 바꾸어진다.
        }
        if(isChecked){
            System.out.println("?");
            return ;
        }
        System.out.println(charcter);
    }
}
