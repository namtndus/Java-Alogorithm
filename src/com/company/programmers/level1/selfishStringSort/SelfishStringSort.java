package com.company.programmers.level1.selfishStringSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfishStringSort {

    public String[] solution(String[] strings, int n){
        Arrays.sort(strings);
        String[] answer = new String[strings.length];
        for(int i = 0; i < strings.length; i++){
            answer[i] = strings[i].substring(n, n+1);
        }
        Arrays.sort(answer);

        ArrayList<String> list = new ArrayList<>(Arrays.asList(strings));
        for(int i = 0; i < answer.length; i++){
            for(int j = 0; j < list.size(); j++){
                if(list.get(j).substring(n, n+1).equals(answer[i])){
                    answer[i] = list.get(j);
                    list.remove(list.get(j));
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        SelfishStringSort stringSort = new SelfishStringSort();
        String[] arg = {"abcd","abce","cdx"};
        String[] answer = stringSort.solution(arg ,2);

        for(int i = 0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }

}
