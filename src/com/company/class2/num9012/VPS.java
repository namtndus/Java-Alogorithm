package com.company.class2.num9012;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class VPS {
    public static void main() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size = Integer.parseInt(br.readLine());
        for(int i = 0; i<size; i++){
            String input = br.readLine();
            find(input);
        }

    }
    static String find(String input) {
        StringTokenizer st = new StringTokenizer(input, "");
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if (st.nextToken().equals('(')) {
                stack.push("(");
            } else {
                if (stack.empty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
