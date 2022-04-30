package com.company.programmers.level1.ReverseTernary;

public class reverseTernary {

    public int solution(int n){
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        int divid = n;


        while(divid >= 3 ){
            sb.append(divid % 3);
            divid = divid /3;
        }

        sb.append(divid);

        String ternary = sb.toString();
        for(int i = 0; i < ternary.length(); i++){
            answer += Math.pow(3,ternary.length()-1-i) * Integer.parseInt(ternary.substring(i,i+1));
        }

        return answer;
    }

    public static void main(String[] args) {
        reverseTernary ternary = new reverseTernary();
        System.out.println(ternary.solution(45));
    }

}
