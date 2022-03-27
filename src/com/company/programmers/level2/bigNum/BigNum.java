package com.company.programmers.level2.bigNum;

import java.util.Arrays;

public class BigNum {

    static int[] numbers = {6,10,2};

    public static void main(String[] args) {

        String[] stringNumbers = new String[numbers.length];

        for(int i = 0; i< numbers.length; i++){
            stringNumbers[i] = Integer.toString(numbers[i]);
        }

        Arrays.sort(stringNumbers, (o1, o2) -> (o2+o1).compareTo(o1+o2));

        if(stringNumbers[0].equals("0")){
            System.out.println(0);
            return ;
        }


        System.out.println(String.join("",stringNumbers));

    }

}
