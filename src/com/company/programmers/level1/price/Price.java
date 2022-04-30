package com.company.programmers.level1.price;

public class Price {
    public long solution(int price, int money, int count){
        int sum = 0;
        long total = 0;
        for(int i = 0; i < count; i++){
            sum += price;
            total += sum;
        }

        return total <= money ? 0L : total- money;
    }

    public static void main(String[] args) {
        Price price = new Price();
        System.out.println(price.solution(3,20,4));
    }

}
