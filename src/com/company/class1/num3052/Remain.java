package com.company.class1.num3052;

import java.util.ArrayList;
import java.util.Scanner;

public class Remain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> remains = new ArrayList<>();
        for(int i =0; i<10; i++){
            int num = sc.nextInt();
            int remain = num%42;
            if(i == 0){
                remains.add(remain);
            }else{
                for(int j=0; j<remains.size(); j++){
                    if(remains.get(j).equals(remain)){
                        break;
                    }else if(remains.size()-1 == j){
                        remains.add(remain);
                    }
                }
            }
        }
        System.out.println(remains.size());
    }
}
