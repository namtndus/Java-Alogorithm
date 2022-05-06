package com.company.programmers.level2.camouflage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class Camouflage {
    public int solution(String[][] clothes){
        HashMap<String, ArrayList<String>> clothesList = new HashMap<>();
        int answer = 1;

        for(int i = 0; i< clothes.length; i++){
            if(!clothesList.containsKey(clothes[i][1]))
                clothesList.put(clothes[i][1],new ArrayList<>());
            clothesList.get(clothes[i][1]).add(clothes[i][0]);
        }

        Iterator<String> keys = clothesList.keySet().iterator();
        while(keys.hasNext()){
            answer *= (clothesList.get(keys.next()).size() +1);
        }


        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes1 = new String[][]{{"yellowhat", "headgear"},{"bluesunglasses", "eyewear"},{"green_turban", "headgear"}};
        String[][] clothes2 = new String[][]{{"crowmask", "face"},{"bluesunglasses", "face"},{"smoky_makeup","face"}};
        //System.out.println(Arrays.deepToString(clothes2));
        Camouflage camouflage = new Camouflage();
        System.out.println(camouflage.solution(clothes2));
    }
}
