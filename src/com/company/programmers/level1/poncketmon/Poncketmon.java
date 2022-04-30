package com.company.programmers.level1.poncketmon;

import java.util.HashSet;

public class Poncketmon {
    public int solution(int[] nums){
        int size = nums.length/2;
        HashSet<Integer> set = new HashSet<>();
        int answer = 0;

        for(int i = 0; i<nums.length; i++){
            set.add(nums[i]);
        }
        if (set.size() >= size) {
            return size;
        }else{
            return set.size();
        }
    }

    public static void main(String[] args) {
        Poncketmon poncketmon = new Poncketmon();
        int[] nums = new int[]{3,3,3,2,2,4};
        System.out.println(poncketmon.solution(nums));
    }
}
