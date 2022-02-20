package com.company.class2.num2231;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int result = 0;

        for(int i = 0; i < num; i++){
            int number = i;
            int sum = 0; // 각 자릿수 합 변수

            while(number != 0){
                sum += number % 10; // 각 자릿수 한 변수
                number /= 10;
            }

            // i 값과 가가 자릿수 누적합이 같을 경우 (생선자를 찾았을 경우)
            if (sum + i == num){
                result = i;
                break;
            }
        }

        System.out.println(result);
    }
}
