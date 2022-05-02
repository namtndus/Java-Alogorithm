package com.company.programmers.level2.stockPrices;

import java.util.ArrayList;

public class StockPrices {

    public int[] solution(int[] prices){
        int[] answer = new int[prices.length];
        ArrayList<Integer> queue = new ArrayList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i : prices){
            queue.add(i);
        }

        while(!queue.isEmpty()){
            int i = 0;
            int output = queue.remove(0);

            if(queue.isEmpty()){
                arrayList.add(0);
                break;
            }
            while(i<queue.size()){
                if(output > queue.get(i)){
                    break;
                }
                i++;
            }
            if(i>=queue.size()){
                arrayList.add(i);
            }else{
                arrayList.add(i+1);
            }
        }

        for(int i = 0; i < answer.length; i++){
            answer[i] = arrayList.get(i);
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
