package com.company.programmers.level3.changingWord;

import java.util.LinkedList;
import java.util.Queue;

public class ChangingWord {
    public int solution(String begin,String target, String[] words){
        boolean[] isVisited = new boolean[words.length];
        int answer = 0;

        //answer = dfs(begin,target,words,isVisited,0);

        answer = bfs(begin,target,words);



//        if(answer == Integer.MAX_VALUE){
//            return 0;
//        }

        return answer;
    }

    private int bfs(String begin, String target, String[] words) {
        int result = 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(begin);
        while(!queue.isEmpty()){
            String front = queue.remove();
            if(front.equals(target)){
                break;
            }
            for(int i = 0; i< words.length; i++){
                int size = front.length();
                for(int j = 0; j < words[i].length(); j++){
                    if (front.substring(j,j+1).equals(words[i].substring(j,j+1))) {
                        size--;
                    }
                }
                if(size == 1){
                    queue.add(words[i]);
                }
            }
            result++;
        }
        return result;
    }

    private int dfs(String begin, String target, String[] words,boolean[] isVisited,int num) {

        int result = Integer.MAX_VALUE;

        if(begin.equals(target)){
            return num;
        }

        for(int i = 0; i< words.length; i++){
            int size = begin.length();
            if(!isVisited[i]){
                for(int j = 0; j < words[i].length(); j++){
                    if (begin.substring(j,j+1).equals(words[i].substring(j,j+1))) {
                        size--;
                    }
                }
            }
            if(size == 1){
                isVisited[i] = true;
                int number = dfs(words[i], target,words,isVisited,num+1);
                result =  result > number ? number : result;
                isVisited[i] = false;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        ChangingWord changingWord = new ChangingWord();
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(changingWord.solution("hit","cog",words));
    }
}
