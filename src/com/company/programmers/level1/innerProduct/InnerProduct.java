package com.company.programmers.level1.innerProduct;

public class InnerProduct {

    public int solution(int[] a, int[] b){
        int answer = 0;

        for(int i = 0; i < a.length; i++){
            answer += a[i] * b[i];
        }

        return answer;
    }

    public static void main(String[] args) {
        InnerProduct input = new InnerProduct();
        int[] a = {-1,0,1};
        int[] b = {1,0,-1};
        System.out.println(input.solution(a,b));
    }
}
