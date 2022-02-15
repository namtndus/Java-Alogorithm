package com.company.class1.num2920;

import java.util.Scanner;

public class Music {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[]{1,2,3,4,5,6,7,8};
        int firstNum = sc.nextInt();
        if(firstNum == 1){
            for(int i = 1; i<num.length; i++){
                firstNum = sc.nextInt();
                if(firstNum != num[i]){
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
            return;
        }else if(firstNum ==8){
            for(int i = num.length-2; i>-1; i--){
                firstNum = sc.nextInt();
                if(firstNum != num[i]){
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
            return;
        }else{
            System.out.println("mixed");
        }
    }
}
