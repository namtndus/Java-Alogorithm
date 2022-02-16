package com.company.class2.num2798;

import java.util.Arrays;
import java.util.Scanner;

public class BlackJack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 총 받아노는 숫자의 갯수
        int size = sc.nextInt();

        // 넘지않으면서 가까워져야 한는 숫자
        int total = sc.nextInt();

        // 배열로 숫자들을 받아오자
        int[] nums = new int[size];
        for(int i = 0; i< size; i++){
            nums[i] = sc.nextInt();
        }

        int max = 0;

        Arrays.sort(nums);
        for(int i = 0; i<size; i++){
            for(int j = i+1; j<size; j++){
                for(int z = j+1; z<size; z++){
                    int sum = nums[i] + nums[j] + nums[z];
                    if(sum<=total && max <sum){
                        max = sum;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
