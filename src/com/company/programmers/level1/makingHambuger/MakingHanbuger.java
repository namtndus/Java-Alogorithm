package com.company.programmers.level1.makingHambuger;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MakingHanbuger {
    public static void main(String[] args) {
        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2};
        System.out.println(solution(ingredient));
    }

    public static int solution(int[] ingredient) {
        List<Integer> list = Arrays.stream(ingredient).boxed().collect(Collectors.toList());
        List<Integer> compareList = Arrays.asList(1,2,3,1);
        boolean flag = false;
        int count = 0;

        while(!flag){

            for(int i = 0; i<list.size(); i++){
                if(list.size() - i < compareList.size()){
                    flag = true;
                    break;
                }
                if(list.get(i).equals(compareList.get(0)) && list.get(i+1).equals(compareList.get(1))
                        && list.get(i+2).equals(compareList.get(2)) && list.get(i+3).equals(compareList.get(3))){
                    list.remove(i);
                    list.remove(i);
                    list.remove(i);
                    list.remove(i);
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
