package com.company.class2.num10828;

import java.util.Scanner;
import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();

        int n = sc.nextInt();
        for(int i = 0; i<n; i++){
            String command = sc.next();
            if(command.equals("push")){
                int num = sc.nextInt();
                stack.push(num);
            }else if(command.equals("pop")){
                if(stack.empty() == true){
                    System.out.println(-1);
                }else {
                    System.out.println(stack.pop());
                }
            }else if(command.equals("size")){
                System.out.println(stack.size());
            }else if(command.equals("empty")){
                if(stack.empty() == true){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                if(stack.empty() == true){
                    System.out.println(-1);
                }else{
                    System.out.println(stack.peek());
                }

            }

        }

    }
}
