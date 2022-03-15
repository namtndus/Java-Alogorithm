package com.company.programmers.kakaoCrane;

import java.util.Stack;

public class KakaoCrane {
    // 보드판에 인형이 있는 위치를 표시한 것 0은 빈칸을 으리마하고 다른 번호는 인형을 의미한다 같은 수는 같은 종류의 인형으로 간주된다
    static int[][] board = {{0, 0, 0, 0, 0},{0, 0, 1, 0, 3},{0, 2, 5, 0, 1},{4, 2, 4, 4, 2},{3, 5, 1, 3, 1}};
    static int[] move = {1, 5, 3, 5, 1, 2, 1, 4};

    public static void main(String[] args) {

        int answer = 0;
        int kide;
        Stack<Integer> stack = new Stack<>();

        // 함수를 출력 => 이 함수는 크레인에서 나오는 인형의 종류를 나타내는 숫자를 출력합니다.
        for(int i = 0; i< move.length; i++){
            kide = crane(move[i]-1);
            if(!stack.empty()){
                if(kide == stack.peek()){
                    stack.pop();
                    answer+=2;
                }else{
                    stack.push(kide);
                }
            }else{
                stack.push(kide);
            }

        }

        System.out.println(answer);
    }

    private static int crane(int num) {
        int back = 0;
        for(int i = 0; i<board.length; i++){
            if(board[i][num] != 0){
                back = board[i][num];
                board[i][num] = 0;
                break;
            }
        }
        return back;
    }
}
