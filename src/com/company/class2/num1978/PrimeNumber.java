package com.company.class2.num1978;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // 2에서 1000까지 소수를 다 찾음
        // for문을 돌면서 해당 인덱스의 값이 true이면 소수인 것으로 하자!
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        ArrayList<Boolean> primeList;
        int n = 1000;
        int count = 0;
        primeList = new ArrayList<>(n+1);

        primeList.add(false);
        primeList.add(false);

        for(int i = 2; i<=n; i++){
            primeList.add(i,true);
        }

        for(int i =2; (i*i)<=n; i++){
            if(primeList.get(i)){
                for(int j = i*i; j <= n; j+=i)  primeList.set(j, false);
            }
        }
        for(int i = 0; i<size; i++){
            int num = sc.nextInt();
            if(primeList.get(num)){
                count++;
            }
        }
        System.out.println(count);
    }
}
