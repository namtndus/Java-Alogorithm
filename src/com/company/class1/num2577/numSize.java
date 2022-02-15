package com.company.class1.num2577;

import java.util.ArrayList;
import java.util.Scanner;

public class numSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] letter = new char[]{'0','1','2','3','4','5','6','7','8','9'};
        ArrayList<Integer> alt = new ArrayList<>();
        int total = sc.nextInt();
        String str = "";
        for(int i = 0; i<2; i++){
            total *= sc.nextInt();
        }
        str = String.valueOf(total);
        char[] letters = str.toCharArray();
        for(int i =0; i<letter.length; i++){
            int num = 0;
            for(int j =0; j<letters.length; j++){
                if(letter[i]==letters[j]){
                    num +=1;
                }
                if(j==letters.length-1){
                    alt.add(num);
                }
            }
        }
        for(int i : alt){
            System.out.println(i);
        }
    }
}
