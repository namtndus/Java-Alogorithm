package com.company.programmers.level2.jumpTeleportation;

public class JumpTeleportation {
    public int solution(int n){
        int dist = n;
        int min = 1;

        while(dist != 1){
            int divid = dist % 2;
            if(divid == 1){
                min += 1;
            }
            dist = dist /2;
        }

        return min;
    }

    public static void main(String[] args) {
        JumpTeleportation jump = new JumpTeleportation();
        System.out.println(jump.solution(19));
    }
}
