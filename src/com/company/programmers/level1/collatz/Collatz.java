package com.company.programmers.level1.collatz;

public class Collatz {
    static int num = 1;

    public static void main(String[] args) {
        long answer = (long) num;
        int count = 0;

        while(answer != 1 && count < 500){
            if(answer % 2 ==0){
                answer = answer / 2;
            }else{
                answer = (answer * 3) +1;
            }
            count += 1;
        }
        if(count == 500){
            System.out.println(-1);
        }
        System.out.println(count);
    }
}
