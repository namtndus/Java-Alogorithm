package com.company.programmers.level1.getReportResults;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GetReportResults {
    public int[] solution(String[] id_list, String[] report, int k){
        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String >> reports = new HashMap<String, HashSet<String>>();
        HashMap<String, Integer> result = new HashMap<>();

        // 신고를 받은 횟수를 저장할 변수와 중복을 제거한 report을 저장할 변수를 초기화함
        for(String i : id_list){
            reports.put(i,new HashSet<>());
            result.put(i,0);
        }

        // 중복을 제거
        for(String i : report){
            String[] str = i.split(" ");
            reports.get(str[0]).add(str[1]);
        }

        //
        for(String i : id_list){
            Iterator<String> iterator = reports.get(i).iterator();
            while(iterator.hasNext()){
                String name = iterator.next();
                result.put(name, result.get(name)+1);
            }
        }
        for(int i = 0; i< id_list.length; i++){
            Iterator<String> iterator = reports.get(id_list[i]).iterator();
            while (iterator.hasNext()){
                String name = iterator.next();
                if(result.get(name) >= k){
                    answer[i]++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        GetReportResults results = new GetReportResults();
        String[] id_list = {"con", "ryan"};
        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int[] answer = results.solution(id_list,report,3);
        for(int i : answer){
            System.out.println(i);
        }
    }
}
