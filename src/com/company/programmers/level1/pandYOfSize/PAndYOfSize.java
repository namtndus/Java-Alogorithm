package com.company.programmers.level1.pandYOfSize;

public class PAndYOfSize {
    boolean solution(String s){
        boolean answer = false;
        int pSize = 0;
        int ySize = 0;

        for(int i = 0; i<s.length(); i++){
            String charter = s.substring(i,i+1).toUpperCase();
            if(charter.equals("P")){
                pSize++;
            }else if(charter.equals("Y")){
                ySize++;
            }
        }
        if(pSize == ySize){
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        PAndYOfSize size = new PAndYOfSize();
        System.out.println(size.solution("PyY"));
    }
}
