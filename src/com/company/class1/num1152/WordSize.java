package com.company.class1.num1152;

import java.util.Scanner;

public class WordSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letters = sc.nextLine().trim().toCharArray();
        int size = 0;
        for(int i = 0; i<letters.length; i++){
            if(letters[i] == ' '){
                size +=1;
            }
            if(i==letters.length-1){
                size+=1;
            }
        }
        System.out.println(size);
    }
}
