package com.company.programmers.level2.carpet;

public class Carpet {
    static int brown = 10;
    static int yellow = 2;

    public static void main(String[] args) {
        int[] answer = new int[2];
        int area = brown + yellow;
        for(int i = 1; i<= area; i++){
            int row = i;
            int col = area / row;
            if(row > col)
                continue;
            if((row - 2) * (col - 2) == yellow){
                answer[0] = col;
                answer[1] = row;
                System.out.println(answer);
                return;
            }
            System.out.println(answer);
            return;
        }
    }
}
