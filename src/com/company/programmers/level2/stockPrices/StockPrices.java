package com.company.programmers.level2.stockPrices;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class StockPrices {

    public int[] solution(int[] prices){
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        for(int i = 0; i < prices.length; i++){
            queue.add(prices[i]);
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
