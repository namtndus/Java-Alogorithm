package com.company.class2.num2839;

import java.util.Scanner;

public class Sugar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int weight = sc.nextInt();

        int max = 5;
        int min = 3;
        int remain = weight%max;

        for(int i = weight/max; i>=0; i--){
            int divid = i;
            for(int j = remain; j>=0; j--){
                if(remain <min){
                    break;
                }else{
                    if(i == weight/max && j ==remain){

                    }
                }
            }
        }
    }
}
