package com.company.class2.num4949;

import java.io.*;
import java.util.Stack;

public class WorldOfBalance {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String s;

        while(true){
            s = br.readLine();
            if(s.equals(".")){
                break;
            }
            sb.append(solve(s)).append("\n");
        }
        System.out.println(sb);
    }

    private static String solve(String s) {

        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '['){
                stack.push(c);
            }else if(c == ')'){
                if(stack.empty() || stack.peek() !='('){
                    return "no";
                }else{
                    stack.pop();
                }
            }else if(c == ']'){
                if(stack.empty() || stack.peek() != '['){
                    return "no";
                }else{
                    stack.pop();
                }
            }
        }
        if(stack.empty()){
            return "yes";
        }else{
            return "no";
        }
    }
}
