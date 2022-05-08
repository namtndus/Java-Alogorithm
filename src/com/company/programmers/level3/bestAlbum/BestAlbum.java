package com.company.programmers.level3.bestAlbum;

import java.lang.reflect.Array;
import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays){

        HashMap<String, PriorityQueue<int[]>> albuum = new HashMap<>();
        HashMap<String, Integer> sumMap = new HashMap<>();

        for(int i = 0; i < genres.length; i++){
            if(sumMap.containsKey(genres[i])){
                sumMap.put(genres[i], sumMap.get(genres[i]) + plays[i]);
                albuum.get(genres[i]).add(new int[]{plays[i],i});
            }else {
                sumMap.put(genres[i],plays[i]);
                albuum.put(genres[i],new PriorityQueue<>((int[] e1,int[] e2) -> e2[0] - e1[0]));
                albuum.get(genres[i]).add(new int[]{plays[i],i});
            }
        }
        System.out.println(albuum.get("pop").remove()[0]);
        System.out.println(albuum.get("classic").toString());


        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        BestAlbum album = new BestAlbum();
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};
        System.out.println(Arrays.toString(album.solution(genres,plays)));
    }

}
