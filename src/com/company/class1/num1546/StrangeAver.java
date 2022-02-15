package com.company.class1.num1546;

import java.util.Scanner;

public class StrangeAver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int loot = sc.nextInt();
        double total = 0;
        int[] arr = new int[loot];
        int max= 0;
        for(int i = 0; i<loot; i++){
            int num = sc.nextInt();
            if(i ==0){
                max = num;
            }else{
                if(max<num){
                    max = num;
                }
            }
            arr[i] = num;
        }
        for(int i = 0; i<loot; i++){
            total += arr[i]/(double)max*100;
        }
        System.out.println(total/loot);
    }
}
