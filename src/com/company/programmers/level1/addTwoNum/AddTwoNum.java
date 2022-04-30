package com.company.programmers.level1.addTwoNum;

import java.util.*;

public class AddTwoNum {

    public int[] solution(int[] numbers){
        Set<Integer> numList = new TreeSet<>();

        for(int i = 0; i< numbers.length; i++){
            for(int j = i+1; j < numbers.length; j++){
                numList.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[numList.size()];
        int index = 0;

        Iterator<Integer> inter = numList.iterator();
        while(inter.hasNext()){
            answer[index++] = inter.next();
        }

        return answer;

    }

    public static void main(String[] args) {
        AddTwoNum num = new AddTwoNum();
        int[] numbers = new int[]{2,1,3,4,1};
        System.out.println(num.solution(numbers));
    }

}
