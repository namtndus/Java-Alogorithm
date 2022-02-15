package com.company.class1.num10809;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchAlt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] alt = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l',
        'm','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        ArrayList<Integer> total = new ArrayList<>();
        String letter = sc.next();
        char [] letters = letter.toCharArray();
        for(int i =0; i<alt.length; i++){
            for(int j =0; j<letters.length; j++){
                if(alt[i]==letters[j]){
                    total.add(j);
                    break;
                }else if(j == letters.length-1){
                    total.add(-1);
                }
            }
        }

        for(int i :total){
            System.out.print(i + " ");
        }
    }
}
