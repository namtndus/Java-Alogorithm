package com.company.programmers.level3.diskController;

import java.util.Arrays;
import java.util.PriorityQueue;

public class DiskController {
    public int solution(int[][] jobs){
        int answer = 0;
        int end = 0; // 수행되고난 직후의 시간
        int jobsIdx = 0; // jobs 배열의 인덱스
        int count = 0; // 수행된 요청 갯수

        // 원본 배열 오름차순 정렬 (요청시간 오름차순)
        Arrays.sort(jobs,(o1,o2) -> o1[0] - o2[0]);

        // 처리 시간 오름차순으로 정렬되는 우선순위 큐(Heap)
        // 정렬을 어떻게 구헌할 것인지 정의함
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1,o2) -> o1[1] - o2[1]);

        while(count < jobs.length){
            while(jobsIdx < jobs.length && jobs[jobsIdx][0] <= end){
                pq.add(jobs[jobsIdx++]);
            }

            if(pq.isEmpty()){
                end = jobs[jobsIdx][0];
            }else{
                int[] tmp = pq.poll();
                answer += tmp[1] + end - tmp[0];
                end += tmp[1];
                count++;
            }
        }
        return (int) Math.floor(answer / jobs.length);
    }

    public static void main(String[] args) {
        DiskController controller = new DiskController();
        int[][] jobs = new int[][]{{0,3},{1,9},{4,6}};
        System.out.println(controller.solution(jobs));
    }
}
