package com.company.programmers.level1.clickKeyboard;

import org.w3c.dom.ls.LSException;

public class ClickKeyboard {

    public String solution(int[] numbers, String hand){
        StringBuilder sb = new StringBuilder();
        int[] LIndex = {3,0};
        int[] RIndex = {3,2};

        for(int i = 0; i<numbers.length; i++){
            int ele = numbers[i];
            int index = 0;
            while(ele > 3 ){
                ele -=3;
                index++;
            }

            if(ele == 1){
                sb.append("L");
                LIndex[0] = index;
                LIndex[1] = 0;
            }else if(ele == 2){
                int Lsize = Math.abs(LIndex[0]- index) + (1 - LIndex[1]);
                int Rsize = Math.abs(RIndex[0]- index) + (RIndex[1] - 1);
                if(Lsize < Rsize){
                    sb.append("L");
                    LIndex[0] = index;
                    LIndex[1] = 1;
                }else if(Rsize < Lsize){
                    sb.append("R");
                    RIndex[0] = index;
                    RIndex[1] = 1;
                }else if(Lsize == Rsize){
                    if(hand.equals("left")){
                        sb.append("L");
                        LIndex[0] = index;
                        LIndex[1] = 1;
                    }else{
                        sb.append("R");
                        RIndex[0] = index;
                        RIndex[1] = 1;
                    }
                }
            }else if(ele == 3){
                sb.append("R");
                RIndex[0] = index;
                RIndex[1] = 2;
            }else if(ele == 0){
                int Lsize = (3 - LIndex[0]) + (1 - LIndex[1]);
                int Rsize = (3 - RIndex[0]) + (RIndex[1]-1);
                if(Lsize < Rsize){
                    sb.append("L");
                    LIndex[0] = 3;
                    LIndex[1] = 1;
                }else if(Rsize < Lsize){
                    sb.append("R");
                    RIndex[0] = 3;
                    RIndex[1] = 1;
                }else if(Lsize == Rsize){
                    if(hand.equals("left")){
                        sb.append("L");
                        LIndex[0] = 3;
                        LIndex[1] = 1;
                    }else{
                        sb.append("R");
                        RIndex[0] = 3;
                        RIndex[1] = 1;
                    }
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ClickKeyboard keyboard = new ClickKeyboard();
        int[] number = {7,0,8,2,8,3,1,5,7,6,2};
        System.out.println(keyboard.solution(number,"left"));
    }
}
