package com.company.programmers.level3.bestAlbum;

import java.lang.reflect.Array;
import java.util.*;

public class BestAlbum {
    public int[] solution(String[] genres, int[] plays){

        HashMap<String, PriorityQueue<int[]>> albuum = new HashMap<>();
        HashMap<String, Integer> sumMap = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

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

        List<Map.Entry<String,Integer>> entryList = new LinkedList<>(sumMap.entrySet());
        entryList.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });

        for(Map.Entry<String,Integer> entry : entryList){
            if(albuum.get(entry.getKey()).size() >=2){
                list.add(albuum.get(entry.getKey()).remove()[1]);
            }
            list.add(albuum.get(entry.getKey()).remove()[1]);

        }

        int[] answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        BestAlbum album = new BestAlbum();
        String[] genres = new String[]{"classic", "pop", "classic", "classic", "pop"};
        int[] plays = new int[]{500, 600, 150, 800, 2500};
        System.out.println(Arrays.toString(album.solution(genres,plays)));
    }

}
