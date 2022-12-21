package com.company.programmers.level2.stockPrices;

import java.util.Stack;

public class StockPrices {

    public int[] solution(int[] prices){
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < prices.length; i++){
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            answer[stack.peek()] = prices.length - stack.peek();
            stack.pop();
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{1,2,3,2,3};
        StockPrices stockPrices = new StockPrices();
        int[] result =stockPrices.solution(prices);
        for(int i: result){
            System.out.println("i = " + i);
        }
    }

}
