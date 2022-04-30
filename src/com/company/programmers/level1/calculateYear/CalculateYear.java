package com.company.programmers.level1.calculateYear;

public class CalculateYear {
    public String solution(int a, int b){
        String[] days = new String[]{"THU","FRI","SAT","SUN","MON","TUE","WEB"};
        int[] months = new int[]{0,31,29,31,30,31,30,31,31,30,31,30,31};
        int count = 0;

        for (int i =1; i<a; i++){
            count += months[i];
        }

        count += b;

        return days[count%7];
    }

    public static void main(String[] args) {
        CalculateYear year = new CalculateYear();
        System.out.println(year.solution(12,24));
    }
}
