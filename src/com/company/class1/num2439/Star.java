package com.company.class1.num2439;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char gap = ' ';
        char star = '*';
        for(int i = 1; i<=size; i++){
            String str = "";
            for(int j = size-i; j>0; j--){
                str += gap;
            }
            for(int z = 0; z<i; z++) {
                str += star;
            }
            System.out.println(str);
        }
    }
}
